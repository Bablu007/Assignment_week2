package com.example.demo.Model;

public class User {
private int id;
private String name;
private String emailId;
private int age;

public User() {}


public User(int id, String name, String emailId, int age) {
	super();
	this.id = id;
	this.name = name;
	this.emailId = emailId;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
