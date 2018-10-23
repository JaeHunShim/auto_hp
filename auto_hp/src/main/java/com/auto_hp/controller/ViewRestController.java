/**
 * @author: 심재훈
 * @date:2018-10-18
 * @filename:ViewRestContrller.java
 */
package com.auto_hp.controller;

import java.util.List;

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
	 * @return :entity(List) 객체 (Restful)
	 * @function : domain이름에 관한 데이터를 비동기식으로 처리 
	 * @version:0.0.1
	 */
	@PostMapping("/main/start/domain_name")
	public ResponseEntity<List<SiteInformation>> domainName(@RequestBody SiteInformation sInfo) throws Exception{
		
		ResponseEntity<List<SiteInformation>> entity = null;

		try {
			entity = new ResponseEntity<List<SiteInformation>>(SInforService.domainName(sInfo),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
