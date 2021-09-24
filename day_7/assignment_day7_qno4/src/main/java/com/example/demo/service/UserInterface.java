package com.example.demo.service;

import java.util.List;

import com.example.demo.Model.User;

public interface UserInterface {
public User saveUser(User user);
public List<User> getAll();
public User getUserById(int id);
}
