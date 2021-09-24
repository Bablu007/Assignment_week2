package com.eg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.eg2.Cart;


@Configuration
@ComponentScan(basePackages = {"com.eg","com.eg2"})
public class SpringBeaanAnno {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringBeaanAnno.class);

		//ctx.register(MyConfig.class);
		//ctx.refresh();
		
		
	
	 String[] bean_names = ctx.getBeanDefinitionNames();
     for(String bean_name: bean_names)
     {
         System.out.println(bean_name);
     }
	
	}
	

	
	
	 

}
