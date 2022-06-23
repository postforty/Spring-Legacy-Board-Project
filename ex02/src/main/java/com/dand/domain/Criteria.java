package com.dand.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	
	private int pageNum;
	private int amount;
	private int skipCount;
	
	public Criteria() {
		this(1, 10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.skipCount = this.getSkipCount(pageNum, amount);
		
	}
	
	public int getSkipCount(int pageNum, int amount) {
		return (pageNum-1) * amount;
	}
	

}
