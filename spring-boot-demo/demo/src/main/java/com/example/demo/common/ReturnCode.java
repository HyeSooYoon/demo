package com.example.demo.common;

import java.util.Arrays;

public enum ReturnCode {
	
	RES_001("RES_001", "사용중"), 
	RES_002("RES_002", "미사용"), 
	RES_003("RES_003", "삭제" ), 
	RES_004("RES_004", "알수없음");

	private final String code;
	private final String description;

	ReturnCode(String code, String description) {
		this.code	     = code;
		this.description = description; 
	}
	
	public static String find(String code) { 
		return Arrays.stream(values()) 
				.filter(accountStatus -> accountStatus.code.equals(code)) 
				.map(accountStatus -> accountStatus.description)
				.findFirst()
				.orElse("ERROR"); 
		}



}
