package com.chetank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetank.dao.EmpDao;
import com.chetank.model.Address;
import com.chetank.model.Employee;

@Service
@Transactional
public class EmpServcieImpl implements EmpService{
	@Autowired
	private EmpDao empDao;
	
	public Employee add(Employee e) {	
		System.out.println("In Service");
		return empDao.add(e);		
	}

	public List<Employee> view() { 
		return empDao.view();
	}

	public void remove(Integer id) {
		System.out.println(id);
		empDao.remove(id);
		
	}

	public void update(Employee e) {
		System.out.println(e);
		empDao.update(e);
		
	}

	public Employee getById(Integer id) {
		return empDao.getById(id);
	}
	
}
