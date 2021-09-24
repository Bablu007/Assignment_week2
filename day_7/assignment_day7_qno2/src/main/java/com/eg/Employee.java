package com.eg;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("empp")
@Scope("prototype")
public class Employee{
	private String name;
	private A oa;

	public Employee(A oa) {
		this.oa = oa;
		System.out.println("Employee(A oa) constructor");
	}
	
	public Employee() {
		System.out.println("Employee() cosntructor");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
