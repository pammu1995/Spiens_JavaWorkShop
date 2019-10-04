package com.chetank.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chetank.model.Address;
import com.chetank.model.Employee;

@Repository
public class AddressDaoImpl implements AddressDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void add(Address a) {
		sessionFactory.getCurrentSession().save(a);
	}

	public List<Address> view() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Integer id) {
		System.out.println("In Delete Address");
		Query q = sessionFactory.getCurrentSession().createQuery("delete Address where employee_id = " + id);
		q.executeUpdate();
	}

	public void update(Address a) {
		// TODO Auto-generated method stub

	}

	public Address getById(Integer id) {
		Address a=sessionFactory.getCurrentSession().load(Address.class, id);
		System.out.println(a);
		return a;
	}
}
