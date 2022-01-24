package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.user;
import com.example.demo.repo.userrepo;

@Service
public class userserviceimpl implements userservice {
	@Autowired
	userrepo ur;

	@Override
	public void addUser(user u) {
		ur.save(u);
		
	}

	@Override
	public user getUser(long id) {
		return ur.findById(id).get();
	}

	@Override
	public user updateUser(user u) {
		ur.save(u);
		return u;
	}

	@Override
	public String deleteUser(long id) {
		user u =ur.findById(id).get();
		ur.delete(u);
		return id + "is deleted successfully";
	}

	@Override
	public String userLogin(long id) {
		user u = ur.findById(id).get();
		//ur.save(u);
		return "user " +id + " is Logged In";
		
	}
	
	

}
