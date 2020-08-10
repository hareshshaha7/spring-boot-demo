package com.haresh.application;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.haresh.model.Employee;

@ComponentScan({"com.haresh.configuration"})
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);

	}

}
