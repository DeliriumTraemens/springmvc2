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
	
	@GetMapping("/calculator")
	public String calculate(@RequestParam(value = "a",required = false)String a,
	                        @RequestParam(value="b",required = false)String b,
	                        @RequestParam(value = "operation",required =false)String operation,
	                        Model model){
		int num1=Integer.valueOf(a);
		int num2=Integer.valueOf(b);
		double result;
		switch (operation){
			case "add":
				result=num1+num2;
				break;
			case "sub":
				result=num1-num2;
				break;
			case "mul":
				result=num1*num2;
				break;
			case "div":
				result=num1/(double)num2;
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + operation);
		}
				String resulted=Double.toString(result);
	model.addAttribute("resultat",resulted);
	return "first/calculate";
	}
	
	@GetMapping("/goodbye")
	public String goodByePage(){
		return "first/goodbye";
	}
}
