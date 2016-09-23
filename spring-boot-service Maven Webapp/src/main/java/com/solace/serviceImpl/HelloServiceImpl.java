package com.solace.serviceImpl;

import org.springframework.stereotype.Service;

import com.solace.service.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService{
	 	@Override
	    public String sayHello() {
	        return "hello dubbo";
	    }
}
