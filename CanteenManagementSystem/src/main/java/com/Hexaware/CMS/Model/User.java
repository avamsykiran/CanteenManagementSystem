package com.Hexaware.CMS.Model;

public class User {

	private long userId;
	private String fullName;
	private String mobile;
	private String emailId;
	private String password;
	private Role role;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long userId, String fullName, String mobile, String emailId, String password, Role role) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.mobile = mobile;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}

	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "userId=" + userId + ", fullName=" + fullName + ", mobile=" + mobile + ", emailId=" + emailId
				+ ", role=" + role;
	}

	
}
