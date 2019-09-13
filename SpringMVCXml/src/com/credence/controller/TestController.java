package com.credence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/hello")
	public String test1(Model model) {
		System.out.println("Bugger");
		model.addAttribute("msg", "Welcome!!");
		return "hello-world";
	}
	
}
