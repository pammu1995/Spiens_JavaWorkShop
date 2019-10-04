package com.chetank.service;

import java.util.List;

import com.chetank.model.Address;
import com.chetank.model.Employee;

public interface EmpService {
	//method for sending Employee details to DAO layer
	public Employee add(Employee e);
	//method for fetching Employee details from DAO layer
	public List<Employee> view();
	//method to send Employee's id to DAO layer for deleting record from database
	public void remove(Integer id);
	//method for fetching single Employee
	public Employee getById(Integer id);
	//method to sending Employee object to DAO layer for updating in database
	public void update(Employee e);
}
