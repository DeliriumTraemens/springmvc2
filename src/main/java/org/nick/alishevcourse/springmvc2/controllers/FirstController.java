package org.nick.alishevcourse.springmvc2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
//@RequestMapping("/first")
public class FirstController {
	
//	@GetMapping("/hello")
//	public String helloPage(HttpServletRequest request){
//		String name = request.getParameter("name");
//		String surname = request.getParameter("surname");
//		System.out.println("Hello, "+name+" "+surname);
//	return "first/hello";
//	}

//	@RequestParam("имя(ключ)параметра запроса") [кладем в ]String name
//	АХТУНГ!!! @RequestParam ОБЯЗАТЕЛЬНЫ!!! Без них, в отличие от HttpServletRequest будет выдана ошибка 404.
//	Для избежания 404 добавляем аргумент required = false @RequestParam(value = "name",required = false)
	@GetMapping("/hello")
	public String helloPage(@RequestParam(value = "name",required = false) String name,
	                        @RequestParam(value = "surname",required = false) String surname,
	                        Model model){
		model.addAttribute("message", "Hello, "+name+" "+surname);
		System.out.println("Hello, "+name+" "+surname);
		return "first/hello";
	}
	
	@GetMapping("/goodbye")
	public String goodByePage(){
		return "first/goodbye";
	}
}
