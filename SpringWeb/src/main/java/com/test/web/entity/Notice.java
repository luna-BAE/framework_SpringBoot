package com.test.web.entity;

public class Notice {

	private int deptno;
	private String dname;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}
	
	public Notice(int deptno, String dname) {
		super();
		this.deptno = deptno;
		this.dname = dname;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Notice [deptno=" + deptno + ", dname=" + dname + "]";
	}
	
	
	
}