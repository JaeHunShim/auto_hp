package com.auto_hp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.auto_hp.domain.UserVO;
import com.auto_hp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@GetMapping("/")
	public String main() {
		return "redirect:/login";
	}
	@GetMapping("/login")
	public String login() {
		
		return "/user/login";
	}
	//login 처리
	@PostMapping("/login")
	public String loginPost(UserVO userVO, Model model) throws Exception{
		
		model.addAttribute("userVO",userService.login(userVO));
		
		return "redirect:/main/index";
	}
	@GetMapping("/signup")
	public String signUp() {
		
		return "/user/signup";
	}
	//join 처리
	@PostMapping("/signup")
	public String postSignup(UserVO userVO) throws Exception {
		
		userService.signup(userVO);
		
		return "redirect:/login";
	}
	
}
