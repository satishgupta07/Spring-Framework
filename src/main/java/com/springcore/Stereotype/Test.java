package com.springcore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = 
				new ClassPathXmlApplicationContext("com/springcore/Stereotype/stereoconfig.xml");
		
		Student student = con.getBean("student", Student.class);
		
		System.out.println(student);

	}

}
