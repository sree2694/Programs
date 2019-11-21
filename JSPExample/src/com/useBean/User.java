package com.useBean;

public class User {
	private int uid;
	private String uname;
	private String ucity;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String ucity) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.ucity = ucity;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", ucity=" + ucity + "]";
	}
	
}
