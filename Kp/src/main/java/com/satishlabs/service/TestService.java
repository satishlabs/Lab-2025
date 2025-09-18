package com.satishlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.satishlabs.model.Order;

@Service
public class TestService {
	
	@Autowired
	KafkaTemplate<String, String> stringKafkaTemplate; //1
	
	@Autowired
	KafkaTemplate<String, Order> orderKafkaTemplate; //2
	
	private static final String MyHelloTopic = "myHelloTopic";
	private static final String MyOrderTopic = "myOrderTopic";
	
	public void sendMessage(String message) {
		System.out.println("TestService - sendMessage()");
		stringKafkaTemplate.send(MyHelloTopic, message);
	}
	
	public void sendOrder(Order myorder) {
		System.out.println("Test Service - sendOrder()");
		orderKafkaTemplate.send(MyOrderTopic, myorder);
	}
}
