package com.Hexaware.CMS.Service;

import java.util.List;
import java.util.concurrent.CancellationException;

import com.Hexaware.CMS.Model.Vendor;

public interface VendorService {

	List<Vendor> getAll() throws CancellationException;
	Vendor getById()throws CancellationException;
	Vendor add(Vendor vendor)throws CancellationException;
}
