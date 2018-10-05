package com.auto_hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class IndexController {
	
	@RequestMapping("/index")
	public void index() {
		
	}
}
