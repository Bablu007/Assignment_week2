package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Model.User;

@Component
public class UserRepository {
	private List<User> list ;
	public UserRepository() {
		list= new ArrayList<User>();
	}

	public User save(User user) {
		list.add(user);
		return user;
	}

	public List<User> getAll() {
		return list;
	}

	
	public User getUserById(int id) {
		User user1=list.stream().filter((us)->{return us.getId()==id;}).findFirst().get();
		return user1;
	}
	
	
}
