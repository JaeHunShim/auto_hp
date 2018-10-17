package com.auto_hp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.auto_hp.domain.SiteInformation;

@Mapper
public interface InfoMapper {
	
	@Insert("insert into infomation(user_email,site_name,site_perpose) values (#{user_email},#{site_name},#{site_perpose})")
	public void InfoInsert(SiteInformation S_info) throws Exception;
}
