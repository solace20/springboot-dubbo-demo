package com.solace.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solace.service.HelloService;


@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/testDubbo")
	public String testDubbo(){
		return  helloService.sayHello();
	}
	
}
