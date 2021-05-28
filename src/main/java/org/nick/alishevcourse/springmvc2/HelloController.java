package org.nick.alishevcourse.springmvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String sayHello(){
		return "home";
	}
	@GetMapping("/hello")
	public String hello2(){
		return "hello";
	}
	
}
