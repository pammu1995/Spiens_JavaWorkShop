package com.chetank.dao;

import java.util.List;

import com.chetank.model.Project;

public interface ProjectDao {
	
	//for adding Project details in database
	public void add(Project p);
	//method for fetching Project details from database
	public List<Project> view();
	//method to remove project details from database
	public void remove(Integer pid);
	//method to update project address in database
	public void update(Project e);
}
