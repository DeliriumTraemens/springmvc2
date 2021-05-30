package org.nick.alishevcourse.springmvc2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
//@RequestMapping("/first")
public class FirstController {
	
	@GetMapping("/hello")
	public String helloPage(HttpServletRequest request){
	return "first/hello";
	}
	
	@GetMapping("/goodbye")
	public String goodByePage(){
		return "first/goodbye";
	}
}
