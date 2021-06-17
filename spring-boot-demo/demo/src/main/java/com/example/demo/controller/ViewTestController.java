package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewTestController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/view")
	@GetMapping
    public ModelAndView viewTest() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "checker");
		mv.setViewName("viewTest");
		return mv;
    }

}
