/**
 * @author: 심재훈
 * @date:2018-10-18
 * @filename:ViewController.java
 * 
 */
package com.auto_hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

	@PostMapping("/view/myhome")
	public void view() {
		
	}
}
