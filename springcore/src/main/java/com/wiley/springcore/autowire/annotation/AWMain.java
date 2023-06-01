package com.wiley.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/autowiringAnnotationconfig.xml");
		
		 EmpAnnotation e1 =   context.getBean("empAnnotation1",EmpAnnotation.class);
		 
		 System.out.println(e1.getPhones());
	}

}
