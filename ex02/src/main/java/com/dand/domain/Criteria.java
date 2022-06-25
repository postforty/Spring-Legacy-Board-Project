package com.dand.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Criteria {
	
	private int pageNum;
	private int amount;
	private int skip;
	
	private String type;
	private String keyword;
	
	public Criteria() {
		this(1, 10);
		this.skip = 0;
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.skip = (pageNum-1) * amount; // 이 계산식이 있어야 skip 값이 계산되어 페이지 번호 버튼이 작동한다.
	}
	
	public void setPageNum(int pageNum) {
		
		this.skip = (pageNum-1) * amount; // 이 계산식이 있어야 skip 값이 계산되어 페이지 번호 버튼이 작동한다.
		
		this.pageNum = pageNum;
	}
	
	public void setAmount(int amount) {
		
//		this.skip = (pageNum-1) * amount;
		
		this.amount = amount;
	}
	
	public void setSkip(int skip) {
		
		this.skip = skip;
	}
	
	public String[] getTypeArr() {
		
		return type == null? new String[] {}: type.split("");
	}
	
}
