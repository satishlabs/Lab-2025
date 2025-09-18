package com.satishlabs.config;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.exporter.logging.LoggingSpanExporter;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import io.opentelemetry.semconv.ResourceAttributes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.satishlabs.service.ServerLoggingService;

@Configuration
public class OpenTelemetryConfig {

	@Value("${otlp.endpoint:http://localhost:4317}")
	private String newRelicEndpoint;

	@Value("${newrelic.api.key:dummy-key}")
	private String newRelicApiKey;

	@Value("${management.resource.service.name:otel-springboot-app}")
	private String managementResourceServiceName;

	private final ServerLoggingService loggingService;

	public OpenTelemetryConfig(ServerLoggingService loggingService) {
		this.loggingService = loggingService;
	}

	@Bean
	public OpenTelemetry openTelemetry() {
		try {
			// Define the resource to associate with the Tracer
			Resource resource = Resource.getDefault().merge(Resource.create(io.opentelemetry.api.common.Attributes
					.of(ResourceAttributes.SERVICE_NAME, managementResourceServiceName)));

			// Set up OTLP Span Exporter for New Relic
			loggingService.log(ServerLoggingService.LogLevel.INFO, "Configuring OTLP Exporter for New Relic",
					newRelicEndpoint);
			SpanExporter otlpExporter = OtlpGrpcSpanExporter.builder().setEndpoint(newRelicEndpoint)
					.addHeader("api-key", newRelicApiKey).build();

			// Create the TracerProvider with the configured exporters
			SdkTracerProvider tracerProvider = SdkTracerProvider.builder().setResource(resource)
					.addSpanProcessor(BatchSpanProcessor.builder(otlpExporter).build())
					.addSpanProcessor(BatchSpanProcessor.builder(new LoggingSpanExporter()).build()) // For
																										// development
																										// logging
					.build();

			// MeterProvider for metrics (assuming PrometheusExporter is properly defined)
			SdkMeterProvider meterProvider = SdkMeterProvider.builder().setResource(resource).build();

			// Build the OpenTelemetry SDK
			return OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).setMeterProvider(meterProvider).build();

		} catch (Exception e) {
			loggingService.log(ServerLoggingService.LogLevel.ERROR, "Error initializing OpenTelemetry", e);
			throw e;
		}
	}
}
