package com.restjwtpoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello - This is protected resource";
	}

	
	@RequestMapping({ "/admin" })
	public String adminpage() {
		return "Hello Admin";
	}
	
	@RequestMapping({ "/user" })
	public String userpage() {
		return "Hello User";
	}
}