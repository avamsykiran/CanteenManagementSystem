package com.Hexaware.CMS.DAO;

import com.Hexaware.CMS.Model.User;

public interface UserDAO {

	User getUser(String email,String password);
	
}
