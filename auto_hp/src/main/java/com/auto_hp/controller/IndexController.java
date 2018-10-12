package com.auto_hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class IndexController {
	
	@GetMapping("/index")
	public void index() {
		
	}
	@GetMapping("/start/name")
	public void start() {
		
	}
	@GetMapping("/start/domain")
	public void domain() {
		
	}
	@GetMapping("/start/plan")
	public void plan() {
		
	}
}
