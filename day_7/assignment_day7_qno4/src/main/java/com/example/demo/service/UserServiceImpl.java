package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserInterface {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		 userRepository.save(user);
		return user;
	}

	@Override
	public List<User> getAll() {
		return userRepository.getAll() ;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getUserById(id);
	}

}
