/**
 * @author: 심재훈
 * @date:2018-10-19
 * @filename:InfoMapper.java
 */
package com.auto_hp.mapper;
import java.util.List;

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
	 * @return :SiteInformation 객체
	 * @function: 무료,유료에 관한  DB데이터 처리 
	 * @version:0.0.1
	 */
	@Select("select * from urlprice")
	public List<SiteInformation> selectURL(SiteInformation sInfo) throws Exception;
		
}
