package com.app.mod.helloapp.ex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevops {
	@RequestMapping("/rest/hello")
	public String hello(){
		return "Hello Devops ";
	}
	
	@RequestMapping("/rest/sudeer")
	public String myName(){
		return "Hello Sudeer";
	}
}
