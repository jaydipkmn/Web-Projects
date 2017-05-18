package com.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest2 {
    public static void main(String[] args) {  
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");  
          
        Student student=(Student)context.getBean("studentbean");  
        student.displayInfo();  
        System.out.println(student.getAddress().hashCode());
        Student student2=(Student)context.getBean("studentbean");  
        student.displayInfo();  
        System.out.println(student2.getAddress().hashCode());
    }  
}
