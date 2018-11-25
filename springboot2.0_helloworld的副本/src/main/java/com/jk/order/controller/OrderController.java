package com.jk.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
		
	@RequestMapping("/orderIndex")
	public String orderIndex() {
			return "orderIndex";
		}
}
