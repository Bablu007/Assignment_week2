package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lti.model.User;
import com.lti.repository.UserRepository;

import net.bytebuddy.description.type.TypeDefinition.Sort;

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
		//Pageable pg=userRepository.findAll(1,3,Sort);
		return userRepository.findAll() ;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findByAge(int age) {
		
		return userRepository.findByAge(age);
	}

	@Override
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByName(name);
	}

	@Override
	public void updateUser(String name) {
		
		// TODO Auto-generated method stub
		 userRepository.changeToUserName(name);
		
	}
	
	

}
