/**
 * @author: 심재훈
 * @date:2018-10-18
 * @filename:ViewRestContrller.java
 */
package com.auto_hp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auto_hp.domain.SiteInformation;
import com.auto_hp.service.SInformationService;

@RestController
public class ViewRestController {
	@Autowired
	private SInformationService SInforService;
	/**
	 * @author: 심재훈
	 * @date:2018-10-18
	 * @method:domainName
	 * @param :json 형태
	 * @return :entity 객체 (Restful)
	 * @function : domain이름에 관한 데이터를 비동기식으로 처리 
	 * @version:0.0.1
	 */
	@PostMapping("/main/start/domain_name")
	public ResponseEntity<?> domainName(@RequestBody SiteInformation sInfo) throws Exception{
		
		ResponseEntity<?> entity = null;

		try {
			SiteInformation info = new SiteInformation();
			info = SInforService.domainName(sInfo);
			entity = new ResponseEntity<SiteInformation>(info,HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
