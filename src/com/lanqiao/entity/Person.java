package com.lanqiao.entity;

public class Person {
	private int perId ;
	private String perName ;
	public Person() {
	}
	public Person(int perId, String perName) {
		this.perId = perId;
		this.perName = perName;
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + "]";
	}
	
}
