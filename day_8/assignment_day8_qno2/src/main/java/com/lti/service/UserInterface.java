package com.lti.service;

import java.util.List;

import com.lti.model.User;


public interface UserInterface {
public User saveUser(User user);
public List<User> getAll();
public User getUserById(int id);

public List<User> findByAge(int age);
public List<User> findByName(String name);
public void updateUser(String name);

}
