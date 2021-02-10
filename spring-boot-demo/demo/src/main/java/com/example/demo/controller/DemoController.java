package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.ReturnCode;
import com.example.demo.dto.UserDto;

@RestController
public class DemoController {
	
	@RequestMapping("/demo")
	@GetMapping
	public void test() {
		
		System.out.println("리턴코드 : " + ReturnCode.find("RES_001"));
		
	}
	
	@PostMapping("/user")
    public ResponseEntity<String> savePost(final @Valid @RequestBody UserDto userDto) {
        return ResponseEntity.ok().body("postDto 객체 검증 성공");
    }

}
