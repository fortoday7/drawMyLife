package com.drawMyLife.web.vo;

import java.sql.Date;

public class MemberVO {
	private int mno;
	private String email;
	private String pwd;
	private String mname;
	private Date creDate;
	private Date modDate;

	public int getMno() {
		return mno;
	}

	public MemberVO setMno(int mno) {
		this.mno = mno;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public MemberVO setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPwd() {
		return pwd;
	}

	public MemberVO setPwd(String pwd) {
		this.pwd = pwd;
		return this;
	}

	public String getMname() {
		return mname;
	}

	public MemberVO setMname(String mname) {
		this.mname = mname;
		return this;
	}

	public Date getCreDate() {
		return creDate;
	}

	public MemberVO setCreDate(Date creDate) {
		this.creDate = creDate;
		return this;
	}

	public Date getModDate() {
		return modDate;
	}

	public MemberVO setModDate(Date modDate) {
		this.modDate = modDate;
		return this;
	}

	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", email=" + email + ", pwd=" + pwd + ", mname=" + mname + ", creDate="
				+ creDate + ", modDate=" + modDate + "]";
	}
}
