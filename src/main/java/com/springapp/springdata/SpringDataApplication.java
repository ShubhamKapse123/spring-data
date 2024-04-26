package com.springapp.springdata;

import com.springapp.springdata.entites.Student;
import com.springapp.springdata.entites.Teacher;
import com.springapp.springdata.repositories.StudentDAO;
import com.springapp.springdata.repositories.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private TeacherDAO teacherDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
		System.out.println("Spring data project start");
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sql database");
		Student student = new Student("Madhav");
		studentDAO.save(student);

		System.out.println("mongodb database");
		Teacher teacher= new Teacher(10343,"Vishnu");
		teacherDAO.save(teacher);
	}
}
