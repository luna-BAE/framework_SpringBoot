package com.test.web.entity;

public class NoticeView extends Notice{

	private String lecName;
	
	public NoticeView() {
		// TODO Auto-generated constructor stub
	}

	public NoticeView(int stuNo, int lecNo, String stuName, String stuPhone, String lecName) {
		super(stuNo, lecNo, stuName, stuPhone);
		this.lecName = lecName;
	
	}

	public String getLecName() {
		return lecName;
	}

	public void setLecName(String lecName) {
		this.lecName = lecName;
	}

	@Override
	public String toString() {
		return "NoticeView [lecName=" + lecName + ", getStuNo()=" + getStuNo() + ", getLecNo()=" + getLecNo()
				+ ", getStuName()=" + getStuName() + ", getStuPhone()=" + getStuPhone() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
