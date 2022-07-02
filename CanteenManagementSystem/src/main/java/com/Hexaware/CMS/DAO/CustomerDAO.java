package com.Hexaware.CMS.DAO;

import com.Hexaware.CMS.Model.Customer;

public interface CustomerDAO {

	Customer getById(long cid);
	Customer add(Customer cutomer);
	void updateBalance(double balance);
	
}
