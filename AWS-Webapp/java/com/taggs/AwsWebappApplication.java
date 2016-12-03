package com.taggs;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.taggs.cloudjourney.persistence.dao.EmployeeRepository;
import com.taggs.cloudjourney.persistence.model.Employee;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class AwsWebappApplication {
	
	@Autowired
	EmployeeRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(AwsWebappApplication.class, args);
	}
	@Bean
	CommandLineRunner clr(){
		return new CommandLineRunner(){
			public void run(String...args){
				List<String> names = Arrays.asList("John,Paul,George,Ringo".split(","));
				for(String name : names) {
					repo.save(new Employee(name));
				}
				System.out.println("Names in database: " + repo.findAll());
			}
		};
	}
}
