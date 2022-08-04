package com.registration;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="register",eager=true)

public class RegisterData 
{
	String uname;
	String upwd;
	String email;
	double umobile;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getUmobile() {
		return umobile;
	}
	public void setUmobile(double umobile) {
		this.umobile = umobile;
	}
	

}
