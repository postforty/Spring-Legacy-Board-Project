package com.tistory.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT created_datetime From customer")
	public String getTime();
	
	public String getTime2();

}
