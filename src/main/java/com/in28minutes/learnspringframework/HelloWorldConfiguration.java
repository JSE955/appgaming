package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
// Released in JDK 16.
record Person (String name, int age) {};
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
		return new Person("Izzy", 33);
	}
	
	@Bean
	public Address address() {
		return new Address("123 Street", "Charleston");
	}
}
