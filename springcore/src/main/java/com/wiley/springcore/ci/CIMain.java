package com.wiley.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/wiley/springcore/ci/configCI.xml");
      
		PersonClass p1 = (PersonClass) context.getBean("p1");
		
		System.out.println(p1.getName());
	}

}
