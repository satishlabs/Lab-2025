package com.satishlabs.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.satishlabs.util.DataMaskingUtils;
import com.satishlabs.util.TraceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServerLoggingService {

    private static final Logger logger = LoggerFactory.getLogger(ServerLoggingService.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public enum LogLevel {
        EMERG, ALERT, CRIT, ERROR, WARNING, NOTICE, INFO, DEBUG
    }

    public void log(LogLevel level, String message, Object additional) {
        log(level, message, additional, null);
    }

    public void log(LogLevel level, String message, Object additional, Throwable throwable) {
        String traceId = TraceUtil.getCurrentTraceId();
        String spanId = TraceUtil.getCurrentSpanId();

        String masked = serializeMasked(additional);

        String log = String.format(
                "trace_id=%s, span_id=%s, message=%s, data=%s",
                traceId, spanId, message, masked
        );

        switch (level) {
            case EMERG:
            case ALERT:
            case CRIT:
            case ERROR:
                if (throwable != null) logger.error(log, throwable);
                else logger.error(log);
                break;
            case WARNING:
                logger.warn(log);
                break;
            case NOTICE:
            case INFO:
                logger.info(log);
                break;
            case DEBUG:
                logger.debug(log);
                break;
        }
    }

    private String serializeMasked(Object additional) {
        try {
            Object maskedObj = DataMaskingUtils.maskData(additional);
            return objectMapper.writeValueAsString(maskedObj);
        } catch (JsonProcessingException e) {
            return "Error serializing masked data: " + e.getMessage();
        } catch (Exception e) {
            return "Unexpected error masking data: " + e.getMessage();
        }
    }
}
