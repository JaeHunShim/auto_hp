/**
 * @author: 심재훈
 * @date:2018-10-19
 * @filename:InfoMapper.java
 */
package com.auto_hp.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.auto_hp.domain.SiteInformation;

@Mapper
public interface InfoMapper {
	/**
	 * @author: 심재훈
	 * @date:2018-10-19
	 * @method: selectURL
	 * @param : SiteInformation 객체
	 * @return :SiteInformationi 객체
	 * @function: 무료,유료에 관한  DB데이터 처리 
	 * @version:0.0.1
	 */
	@Select("select * from urlprice")
	public SiteInformation selectURL() throws Exception;
		
}
