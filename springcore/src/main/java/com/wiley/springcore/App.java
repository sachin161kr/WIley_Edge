package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/wiley/springcore/configrefStudent.xml");
       
        Student2 st2 = (Student2) context.getBean("s2ref");
        
        System.out.println(st2.getObj().getStudentAddress());
    }
}