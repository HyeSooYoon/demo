package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
 
@RestController
@Api(value = "HelloController", description = "헬로 에이피아이")
public class HelloController {
 
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    @ApiOperation(value="hello, World API", notes="hello, World를 반환하는 API, Ajax 통신 확인용.")
    public String helloWorld() {
        return "hello, World";
    }
}