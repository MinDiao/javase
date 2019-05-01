package com.tz.jdbcDBUtils;
/*
 * 	实体类
 */
public class Tele {
	private int tid;
	private String tname;
	private String tsex;
	private int tage;
	private String telNo;
	private String tqq;
	private String tdir;
	public Tele() {
		super();
	}
	public Tele(int tid, String tname, String tsex, int tage, String telNo, String tqq, String tdir) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tsex = tsex;
		this.tage = tage;
		this.telNo = telNo;
		this.tqq = tqq;
		this.tdir = tdir;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
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
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getTqq() {
		return tqq;
	}
	public void setTqq(String tqq) {
		this.tqq = tqq;
	}
	public String getTdir() {
		return tdir;
	}
	public void setTdir(String tdir) {
		this.tdir = tdir;
	}
	@Override
	public String toString() {
		return "Person [tid=" + tid + ", tname=" + tname + ", tsex=" + tsex + ", tage=" + tage + ", telNo=" + telNo
				+ ", tqq=" + tqq + ", tdir=" + tdir + "]";
	}

}
