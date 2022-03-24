package com.spring.maven.hahalolo.model;

public class Student {
	private String name;
	private String lop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ name: "+name+ ", "
				+ "lop: "+lop+"}";
	}
	
	
}
