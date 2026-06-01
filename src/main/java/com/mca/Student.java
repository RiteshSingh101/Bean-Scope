package com.mca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Student {
	
	@Value(value="101")
	int sid;
	
	@Value(value = "Tanmay")
	String name;
	
	@Autowired
	List<String> subjects;
	
	public void display() {
		System.out.println("id: "+sid);
		System.out.println("Name: "+ name);
		System.out.println("Subjects: "+subjects);
	}
}
