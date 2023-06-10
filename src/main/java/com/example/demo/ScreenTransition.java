package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScreenTransition {
	
	
	@GetMapping("/register")
	  public String start() {
		  return "register.html";
	  }

}
