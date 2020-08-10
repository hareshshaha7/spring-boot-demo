package com.haresh.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.haresh.model.Address;
import com.haresh.model.Employee;

@Configuration
public class SpringConfig {
		
	@Bean
	public Address createAddress() {
		Address address = new Address();
		address.setCity("Pune");
		address.setPincode(411015);
		return address;
	}
	
	@Bean
	public Employee createEmployee() {
		Address address = createAddress();
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Haresh");
		employee.setAddress(address);
		return employee;
	}
		
		
}
