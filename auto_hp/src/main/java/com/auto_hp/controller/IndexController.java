/**
 * @author: 심재훈
 * @date:2018-10-5
 * @filename:ViewContrller.java
 */
package com.auto_hp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.auto_hp.domain.SiteInformation;
import com.auto_hp.service.SInformationService;

@Controller
@RequestMapping("/main")
public class IndexController {
	
	@Autowired
	SInformationService SInfoService;
	
	@GetMapping("/index")
	public void index() {
		
	}
	@GetMapping("/start/name")
	public void start() throws Exception {
		
	}
	/**
	 * @author: 심재훈
	 * @date:2018-10-17
	 * @method:startPost
	 * @param :SiteInformation 객체
	 * @return :SiteInformation 객체
	 * @function: 사이트 이름에 관련된 데이터를 domain.html로 넘김
	 * @version:0.0.1
	 */
	@PostMapping("/start/name")
	public String startPost(SiteInformation s_info,Model model) throws Exception {
		
		model.addAttribute("s_info",SInfoService.siteName(s_info));
		
		return "/main/start/domain";
	
	}
	@GetMapping("/start/domain")
	public void domain() {
		
	}
	@GetMapping("/start/plan")
	public void plan() {
		
	}
}
