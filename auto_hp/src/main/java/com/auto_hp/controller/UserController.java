/**
 * @author: 심재훈
 * @date:2018-10-05
 * @filename:UserController.java
 * 
 */
package com.auto_hp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.auto_hp.domain.UserVO;
import com.auto_hp.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;

	
	@GetMapping("/")
	public String main() {
		return "redirect:/main/index";
	}
	@GetMapping("/login")
	public String login() {
		
		return "/user/login";
	}
	/**
	 * @author: 심재훈
	 * @version: 0.0.1
	 * @date:2018-10-5
	 * @method:loginPost
	 * @function :login 처리
	 * @param:UserVO객체
	 * @return:UserVO객체
	 * @version:0.0.1
	 */
	@PostMapping("/login")
	public String loginPost(UserVO userVO, Model model) throws Exception{
		
		model.addAttribute("userVO",userService.login(userVO));
		
		return "redirect:/view/myhome";
	}
	@GetMapping("/signup")
	public String signUp() {
		
		return "/user/signup";
	}
	/**
	 * @author: 심재훈
	 * @version : 0.0.1
	 * @date:2018-10-5
	 * @method:postSignup
	 * @function :회원가입처리
	 * @param:UserVO객체
	 * @return:UserVO객체
	 * @version:0.0.1
	 */
	@PostMapping("/signup")
	public String postSignup(UserVO userVO) throws Exception {
		
		userService.signup(userVO);
		
		return "redirect:/login";
	}
	
}
