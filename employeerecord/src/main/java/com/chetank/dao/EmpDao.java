package com.chetank.dao;

import java.util.List;

import com.chetank.model.Address;
import com.chetank.model.Employee;

public interface EmpDao {
	
	//for adding Employee details in database
	public Employee add(Employee e);
	//method for fetching Employee details from database
	public List<Employee> view();
	//method to remove Employee details from database
	public void remove(Integer id);
	//method for fetching single Employee
	public Employee getById(Integer id);
	//method to update Employee details in database
	public void update(Employee e);
}
