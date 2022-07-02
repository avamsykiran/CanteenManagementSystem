package com.Hexaware.CMS.DAO;

import java.util.List;

import com.Hexaware.CMS.Model.Vendor;

public interface VendorDAO {

	List<Vendor> getAll();
	Vendor getById(long vid);
	Vendor add(Vendor vendor);
	
}
