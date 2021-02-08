package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.ReturnCode;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping
	public void test() {
		
		System.out.println("리턴코드 : " + ReturnCode.find("RES_001"));
		
	}

}