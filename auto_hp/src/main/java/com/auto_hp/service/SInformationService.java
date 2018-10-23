/**
 * @author: 심재훈
 * @date:2018-10-05
 * @filename:SInformationService.java
 * @function:SInformationServiceImpl.java interface
 */
package com.auto_hp.service;

import java.util.List;

import com.auto_hp.domain.SiteInformation;

public interface SInformationService {
	
	public SiteInformation siteName(SiteInformation s_Info) throws Exception;
	
	public List<SiteInformation> domainName(SiteInformation sInfo) throws Exception;
}
