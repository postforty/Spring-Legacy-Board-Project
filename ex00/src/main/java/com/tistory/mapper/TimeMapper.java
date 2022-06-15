package com.tistory.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT created_datetime From dev.customer")
	public String getTime();

}
