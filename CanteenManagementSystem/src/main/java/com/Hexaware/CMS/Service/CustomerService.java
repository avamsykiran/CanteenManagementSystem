package com.Hexaware.CMS.Service;

import java.util.List;
import java.util.concurrent.CancellationException;

import com.Hexaware.CMS.Model.Customer;

public interface CustomerService {

	List<Customer> getAll() throws CancellationException;
	Customer getById()throws CancellationException;
	Customer add(Customer customer)throws CancellationException;
	
}
