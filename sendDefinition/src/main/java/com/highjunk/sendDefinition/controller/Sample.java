package com.highjunk.sendDefinition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample {
	
	@GetMapping("/")
	public String sample() {
		return "sample.html";
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "insert.html";
	}

}