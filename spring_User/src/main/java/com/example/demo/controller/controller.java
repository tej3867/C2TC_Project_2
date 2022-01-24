package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.user;
import com.example.demo.service.userservice;

@RestController
public class controller {
	
	@Autowired
	userservice us;
	@PostMapping("/addUser")
	public void addStudent(@RequestBody user u) {
		us.addUser(u);
	}

	@GetMapping("/getUser/{id}")
	public user getUser(@PathVariable long id) {
		return us.getUser(id);
}
	
	
	@PutMapping("/updateUser")
	public user updateUser(@RequestBody user u) {
		return  us.updateUser(u);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable long id) {
		return  us.deleteUser(id);
	}

	
	@GetMapping("/userLogin/{id}")
	public String userLogin(@PathVariable long id) {
		return us.userLogin(id);
	}
}
