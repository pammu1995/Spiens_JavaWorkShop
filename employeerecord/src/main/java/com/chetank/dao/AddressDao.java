package com.chetank.dao;

import java.util.List;

import com.chetank.model.Address;
import com.chetank.model.Employee;

//contract for implementation of methods
public interface AddressDao {

	//for adding Address details in database
	public void add(Address a);
	//method for fetching Address details from database
	public List<Address> view();
	//method for fetching single Address from database
	public Address getById(Integer id);
	//method to remove address details from database
	public void remove(Integer id);
	//method to update employee address in database
	public void update(Address a);
}
