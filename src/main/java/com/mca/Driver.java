package com.mca;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student s = app.getBean(Student.class);
		System.out.println("Address 1: "+s); // by default bean scope is singleton
		s.display();
		
		Student s1 = app.getBean(Student.class);
		System.out.println("Address 2: "+s1);
		
		
		System.out.println("----------------");
		Employee emp = app.getBean(Employee.class);
		System.out.println("Emp address: "+emp);
		emp.work();
		
		Employee emp1 = app.getBean(Employee.class);
		System.out.println("Emp address: "+emp1);
		app.close();
	}
}
