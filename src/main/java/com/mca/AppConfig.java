package com.mca;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.mca")
public class AppConfig {

	@Bean
	public List<String> getList(){
		return Arrays.asList("Java","Spring","Hibernate");
	}
	
	@Bean
	@Scope(value="prototype")
	public Employee getEmployee() {
		return new Employee();
	}
}
