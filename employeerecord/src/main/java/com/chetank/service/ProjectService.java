package com.chetank.service;

import java.util.List;

import com.chetank.model.Project;

public interface ProjectService {
	//method for sending Project details to DAO layer
	public void add(Project p);
	//method for fetching Project details from DAO layer
	public List<Project> view();
	//method for send project object to DAO layer for deleting from database
	public void remove(Integer pid);
	//method to send project object to DAO layer for updating in database
	public void update(Project e);
}
