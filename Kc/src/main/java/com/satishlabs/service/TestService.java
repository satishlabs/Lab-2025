package com.satishlabs.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.satishlabs.model.Order;

@Service
public class TestService {

	@KafkaListener(topics = "myhellotopic", groupId = "myjlc_group", containerFactory = "stringKafkaListenerContainerFactory")
	public void receiveMessage(String msg) {
		System.out.println("---TestService --- receiveMessage()---");
		System.out.println(msg);
	}
	
	@KafkaListener(topics = "myordertopic", groupId = "myorder_group", containerFactory = "ordrKafkaListenerContainerFactory")
	public void receiveOrder(Order myorder) {
		System.out.println("---TestService --- receiveOrder()---");
		System.out.println(myorder);
	}
}
