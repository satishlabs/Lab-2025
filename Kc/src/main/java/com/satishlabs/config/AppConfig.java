package com.satishlabs.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.satishlabs.model.Order;

@SpringBootApplication
public class AppConfig {
	@Value(value = "${kafka.bootstrapAddress}")
	private String bootstrapAddress;
	
	@Bean
	public ConsumerFactory<String, String> strinConsumerFactory(){
		System.out.println("strinConsumerFactory");
		Map<String, Object> props = new HashMap<String, Object>();
		
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "myjlc_group");
		props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		
		return new DefaultKafkaConsumerFactory<String, String>(props);
	}
	
	@Bean(name = "stringKafkaListenerContainerFactory")
	public ConcurrentKafkaListenerContainerFactory<String, String> stringKafkaListenerContainerFactory(){
		System.out.println("stringKafkaListenerContainerFactory");
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
		factory.setConsumerFactory(strinConsumerFactory());
		return factory;
	}
	
	
	@Bean
	public ConsumerFactory<String, Order> orderConsumerFactory(){
		System.out.println("orderConsumerFactory");
		
		Map<String, Object> props = new HashMap<String, Object>();
		
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "myorder_group");
		props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		props.put(JsonDeserializer.TRUSTED_PACKAGES, "com.satishlabs");
		
		return new DefaultKafkaConsumerFactory<String, Order>(props);
	}
	
	@Bean(name = "ordrKafkaListenerContainerFactory")
	public ConcurrentKafkaListenerContainerFactory<String, Order> ordrKafkaListenerContainerFactory(){
		System.out.println("ordrKafkaListenerContainerFactory");
		
		ConcurrentKafkaListenerContainerFactory<String, Order> factory = new ConcurrentKafkaListenerContainerFactory<String, Order>();
		factory.setConsumerFactory(orderConsumerFactory());
		return factory;
	}
}
