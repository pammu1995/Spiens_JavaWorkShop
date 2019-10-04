package com.chetank.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chetank.model.Address;
import com.chetank.model.Employee;

@Repository
public class EmpDaoImpl implements EmpDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private ProjectDaoImpl projDao;
	@Autowired
	private AddressDaoImpl addDao;
	
	public Employee add(Employee e) {
		sessionFactory.getCurrentSession().save(e);
		System.out.println("In DAO");
		List<Employee> el = sessionFactory.getCurrentSession().createQuery("from Employee where id in (select max(id) from Employee)").list();  
		return el.get(0);
	}

	public List<Employee> view() {
		return sessionFactory.getCurrentSession().createQuery("from Address").list();
		//List<Employee> employees =  
		//return null;
	}

	public void remove(Integer id) {
		Employee e=sessionFactory.getCurrentSession().load(Employee.class, id);
		System.out.println(e);
		projDao.remove(id);
		addDao.remove(id);
		sessionFactory.getCurrentSession().remove(e);
	}

	public void update(Employee e) {
		System.out.println(e.getId());
		sessionFactory.getCurrentSession().update(e);
	}

	public Employee getById(Integer id) {
		System.out.println(id);
		Employee e = sessionFactory.getCurrentSession().load(Employee.class, id);
		System.out.println(e);
		return e;
	}

}
