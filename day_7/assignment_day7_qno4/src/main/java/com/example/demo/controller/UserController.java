package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.service.UserServiceImpl;

@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
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
	
	@GetMapping("/header")
	ResponseEntity<List<String>> customHeader(@RequestHeader HttpHeaders headers) {
		//System.out.println(head.toString());
	   // HttpHeaders headers = new HttpHeaders();
	    //headers.add("Custom-Header",HttpHeaders.ACCEPT_LANGUAGE);
		System.out.println();
		List<String> connection = headers.getConnection();
	        
	    return new ResponseEntity<>(
	    		connection,HttpStatus.OK);
	}

}
