package com.chetank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetank.dao.ProjectDao;
import com.chetank.model.Project;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao projectDao;
	public void add(Project p) {
		projectDao.add(p);
	}

	public List<Project> view() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Integer pid) {
		// TODO Auto-generated method stub
		
	}

	public void update(Project e) {
		// TODO Auto-generated method stub
		
	}

}
