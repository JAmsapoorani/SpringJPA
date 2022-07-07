package com.springjpa.SpringJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}
@Bean
public CommandLineRunner run(EmployeeRepository repository)
{
	return (args -> {
		insertJavaAdvocates(repository);
		System.out.println(repository.findAll());
		//System.out.println((repository.findEmployeeByLastNameContaining(" ")));
	});
}
	private void insertJavaAdvocates(EmployeeRepository repository)
{
	repository.save((new Employee("amsa","poorani")));
	repository.save((new Employee("mani","bharathi")));
	repository.save((new Employee("nidharsana","v A")));
	repository.save((new Employee("kala","devi")));
}
}
