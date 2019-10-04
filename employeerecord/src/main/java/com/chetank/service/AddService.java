package com.chetank.service;

import java.util.List;

import com.chetank.model.Address;
import com.chetank.model.Employee;

public interface AddService {
	//method for sending Address details to DAO layer
	public void add(Address a);
	//method for fetching Address details from DAO layer
	public List<Address> view();
	//method for fetching single Address
	public Address getById(Integer id);
	//method to send Id to DAO layer for deleting address from database
	public void remove(Integer id);
	//method to send Address object to DAO layer for updating in database
	public void update(Address a);
}
