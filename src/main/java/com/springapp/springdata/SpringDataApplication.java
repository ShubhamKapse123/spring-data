package com.springapp.springdata;

import com.springapp.springdata.onetoone.entities.Laptop;
import com.springapp.springdata.onetoone.entities.Student;
import com.springapp.springdata.repositories.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	@Autowired
	private StudentDAO studentDAO;

	public static void main(String[] args) {
		System.out.println("Spring data project start");
		SpringApplication.run(SpringDataApplication.class, args);
		System.out.println("Spring data project end");
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sql database");
		Student student = new Student();
		student.setStdName("Keshav");
		Laptop laptop= new Laptop();
		laptop.setDeviceName("HP");
		//important
		laptop.setStudent(student);
		student.setLaptop(laptop);
		studentDAO.save(student);

	}
}
