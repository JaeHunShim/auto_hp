package com.auto_hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String main() {
		return "redirect:/login";
	}
	@GetMapping("/login")
	public void login() {
		
	}
	@GetMapping("/signup")
	public void signUp() {
		
	}
}
