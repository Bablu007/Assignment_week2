package com.eg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("abean")
@Scope("prototype")
public class A{
	
	@Autowired
	B b;
	private String str;
	A(){}
	A(String str){
		this.str = str;
		System.out.println("A()"+str);
	}
	
	public void initBn(){
		System.out.println("initBn()...");
	}
	
	public void destroyBn(){
		System.out.println("destroyBn()...");
	}

	@Override
	public String toString() {
		return "A [str=" + str + "]";
	}
	
	
}
