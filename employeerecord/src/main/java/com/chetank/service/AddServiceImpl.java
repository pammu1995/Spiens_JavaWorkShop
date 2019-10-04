package com.chetank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetank.dao.AddressDao;
import com.chetank.model.Address;

@Service
@Transactional
public class AddServiceImpl implements AddService{

	@Autowired
	private AddressDao addressDao;
	public void add(Address a) {
		addressDao.add(a);
	}

	public List<Address> view() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Address a) {
		// TODO Auto-generated method stub
		
	}

	public Address getById(Integer id) {
		// TODO Auto-generated method stub
		return addressDao.getById(id);
	}

}
