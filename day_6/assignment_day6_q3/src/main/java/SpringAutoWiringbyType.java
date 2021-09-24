/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package springautowiringbytype;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 * @author ADMIN
 */
public class SpringAutoWiringbyType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
      

     Map<String,Citizen> map=new HashMap<String, Citizen>();
     Citizen city= (Citizen)ctx.getBean(Citizen.class);
     city.setContactNumber("6355327828");
     city.setEmailId("india@gmail.com");
     city.setName("India");
     
     Citizen city2= (Citizen)ctx.getBean(Citizen.class);
     city2.setContactNumber("6355327828");
     city2.setEmailId("india@gmail.com");
     city2.setName("India");
     map.put("one",  city);
     map.put("two",  city2);
      System.out.println(city2);
     Address address=(Address)ctx.getBean(Address.class);
     address.setPinNo(227408);
     address.setState("U.P");
     System.out.println(address);
     
     Employee emp= (Employee) ctx.getBean(Employee.class);
     emp.setAddress(address);
    emp.setMap(map);
     emp.setName("Emp1");
     emp.setSalary(5000);
     emp.setId(1);

      System.out.println(emp);
    }
    
}
