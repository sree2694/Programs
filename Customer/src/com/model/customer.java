package com.model;

import java.sql.Date;

public class customer {
	private String name;
	private String email;
	private String password;
	private long mobile_no;
	private Date dob;

	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public customer(String name, String email, String password, long mobile_no, Date dob) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile_no = mobile_no;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", email=" + email + ", mobile_no=" + mobile_no + ", dob=" + dob + "]";
	}

}
