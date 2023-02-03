package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
// Released in JDK 16.
record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Jordan";
	}
	
	@Bean
	public int age() {
		return 32;
	}
	
	@Bean
	public Person person() {
		return new Person("Izzy", 33, new Address("567 Street", "Hanahan"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // name, age
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3); // name, age, address2
	}
	
	@Bean("address2")
	public Address address() {
		return new Address("123 Street", "Charleston");
	}
	
	@Bean("address3")
	public Address address3() {
		return new Address("12390 Avenue", "Minneapolis");
	}
}
