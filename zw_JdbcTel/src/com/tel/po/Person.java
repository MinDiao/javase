package com.tel.po;
/*
 * 电话本用户实体类
 */
public class Person {
	private String tname;
	private String tsex;
	private int tage;
	private String ttel;
	private String tqq;
	private String taddr;
	
	public Person() {
		super();
	}
	
	public Person(String tname, String tsex, int tage, String ttel, String tqq, String taddr) {
		super();
		this.tname = tname;
		this.tsex = tsex;
		this.tage = tage;
		this.ttel = ttel;
		this.tqq = tqq;
		this.taddr = taddr;
	}
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	public String getTtel() {
		return ttel;
	}
	public void setTtel(String ttel) {
		this.ttel = ttel;
	}
	public String getTqq() {
		return tqq;
	}
	public void setTqq(String tqq) {
		this.tqq = tqq;
	}
	public String getTaddr() {
		return taddr;
	}
	public void setTaddr(String taddr) {
		this.taddr = taddr;
	}
	
	@Override
	public String toString() {
		return "Person [tname=" + tname + ", tsex=" + tsex + ", tage=" + tage + ", ttel=" + ttel + ", tqq=" + tqq
				+ ", taddr=" + taddr + "]";
	}
	
}
