package com.lti.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.User;
import com.lti.service.UserServiceImpl;


@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/save")
	public User createUser(@Validated @RequestBody User user) {
		 userServiceImpl.saveUser(user);
		
		return user;
	}
	
	@ResponseBody
	@GetMapping("/getall")
	public List<User> getAll(){
		return userServiceImpl.getAll();
	}
	
	@GetMapping("/")
	public ResponseEntity<User> getById(@RequestParam ("id") int id) {
		User userById = userServiceImpl.getUserById(id);
		System.out.println(userById);
		return new ResponseEntity<User>(userById,HttpStatus.FOUND);
		
	}
	
	
	
	@GetMapping("/age")
	public List<User> getByAge(@RequestParam ("age") int age) {
		
		return  userServiceImpl.findByAge(age);
	}

	@GetMapping("/name")
	public List<User> findByName(String name){
		return userServiceImpl.findByName(name);
	}
	
	@PostMapping("/{name}")
	public void updateByName(@PathVariable ("name") String name) {
		 userServiceImpl.updateUser(name); 
	}
	
}
