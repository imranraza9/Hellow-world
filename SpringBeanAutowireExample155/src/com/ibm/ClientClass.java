package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class ClientClass {
   @SuppressWarnings("resource")
public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml"); 
     Employee obj = (Employee ) context.getBean("emp");
     System.out.println(obj.toString());

   }
}