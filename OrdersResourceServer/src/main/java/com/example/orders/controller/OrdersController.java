package com.example.orders.controller;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
	
	@GetMapping("/orders")
	public List<Orders> getOrders(){
		
		Orders order1 = new Orders(UUID.randomUUID().toString(),
				"product-id-1","user-id-1",1,OrderStatus.NEW);
		
		Orders order2 = new Orders(UUID.randomUUID().toString(),
				"product-id-2","user-id-2",1,OrderStatus.NEW);
		
		return Arrays.asList(order1,order2);
		
	}

}
