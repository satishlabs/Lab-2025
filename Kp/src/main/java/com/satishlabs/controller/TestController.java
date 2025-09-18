package com.satishlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satishlabs.model.Order;
import com.satishlabs.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;

	@Value(value = "${kafka.bootstrapAddress}")
	private String bootstrapAddress;


	@GetMapping("/testMessage")
	public String testMessage() {
		System.out.println("---TestController --- testMessage()---");
		testService.sendMessage("Hello Guys - This is message 1");
		testService.sendMessage("Hello Guys - This is message 2");
		return "String Message Sent to Kafka Server @"+bootstrapAddress;
	}
	
	@GetMapping("/testOrder")
	public String placeOrder() {
		System.out.println("--- TestController --- placeOrder() ---");
		Order myorder = new Order(5001, "21-Aug-2025", "C-101", 5, 500, "New");
		testService.sendOrder(myorder);
		return "Order Sent to Kafka Server @"+bootstrapAddress;
	}

}
