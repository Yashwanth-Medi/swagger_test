package com.infinite.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
 
	@RequestMapping(value="/api/hello")
	public String hello() {
		
		return "welcome to infinite";
		
	}
}
