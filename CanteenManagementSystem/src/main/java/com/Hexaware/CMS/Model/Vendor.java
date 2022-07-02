package com.Hexaware.CMS.Model;

public class Vendor extends User{

	public Vendor() {
		this.setRole(Role.VENDOR);
	}

	public Vendor(long userId, String fullName, String mobile, String emailId, String password) {
		super(userId, fullName, mobile, emailId, password, Role.VENDOR);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
