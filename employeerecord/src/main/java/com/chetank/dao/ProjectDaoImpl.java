package com.chetank.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chetank.model.Project;

@Repository
public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void add(Project p) {
		sessionFactory.getCurrentSession().save(p);
	}

	public List<Project> view() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Integer pid) {
		System.out.println("In Delete Project");
		Query q = sessionFactory.getCurrentSession().createQuery("delete Project where employee_id = " + pid);
		q.executeUpdate();
	}

	public void update(Project e) {
		// TODO Auto-generated method stub
		
	}

}
