package com.wiley.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/autowiringconfig.xml");
		
		 Emp e1 =   context.getBean("emp1",Emp.class);
		 
		 System.out.println(e1.getAddress());
	}

}
