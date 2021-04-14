package com.test.web.entity;

public class Notice {

	private int stuNo, lecNo;
	private String stuName, stuPhone;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}

	public Notice(int stuNo, int lecNo, String stuName, String stuPhone) {
		super();
		this.stuNo = stuNo;
		this.lecNo = lecNo;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public int getLecNo() {
		return lecNo;
	}

	public void setLecNo(int lecNo) {
		this.lecNo = lecNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuPhone() {
		return stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	@Override
	public String toString() {
		return "Notice [stuNo=" + stuNo + ", lecNo=" + lecNo + ", stuName=" + stuName + ", stuPhone=" + stuPhone + "]";
	}
	
	
	
}