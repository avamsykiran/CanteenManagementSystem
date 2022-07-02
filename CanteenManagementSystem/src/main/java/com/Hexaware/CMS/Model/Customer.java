package com.Hexaware.CMS.Model;

public class Customer extends User{
	
	private double walletBalance;

	public Customer() {
		this.setRole(Role.CUSTOMER);
	}

	public Customer(long userId, String fullName, String mobile, String emailId, String password,double walletBalance) {
		super(userId, fullName, mobile, emailId, password, Role.CUSTOMER);
		this.walletBalance=walletBalance;
	}

	
	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	@Override
	public String toString() {
		return super.toString() +"\t WalletBalance="+this.walletBalance;
	}
	
	
}
