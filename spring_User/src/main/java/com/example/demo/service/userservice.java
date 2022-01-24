package com.example.demo.service;

import com.example.demo.entities.user;


public interface userservice {
	public void addUser(user u);

	public user getUser(long id);

	public user updateUser(user u);

	public String deleteUser(long id);
	
	public String userLogin(long id);

}
