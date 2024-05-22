package com.springapp.springdata;

import com.springapp.springdata.onetomany.Address;
import com.springapp.springdata.onetomany.StudentOneToMany;
import com.springapp.springdata.repositories.StudentDAO;
import com.springapp.springdata.repositories.StudentOneToManyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;


@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	@Autowired
	private StudentDAO studentDAO;

	@Autowired
	private StudentOneToManyDAO studentOneToManyDAO;

	public static void main(String[] args) {
		System.out.println("Spring data project start");
		SpringApplication.run(SpringDataApplication.class, args);
		System.out.println("Spring data project end");
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sql database");
		//This code for OneToOne Mapping Start
//		Student student = new Student();
//		student.setStdName("Keshav");
//		Laptop laptop= new Laptop();
//		laptop.setDeviceName("HP");
//		//important
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
//		studentDAO.save(student);

		//getting
//		Optional<Student> st= studentDAO.findById("efa8642c-cb3c-42cb-bfcf-a3c67addf1fa");
//         Laptop laptop=st.get().getLaptop();
//		 System.out.println("laptop:"+ laptop.getDeviceName());
		//This code for OneToOne Mapping End

   // OneToMany Mapping Start
//		StudentOneToMany studentOnetoMay = new StudentOneToMany();
//		studentOnetoMay.setStdName("Keshav");
//
//		Address address1= new Address();
//		address1.setCity("Nagpur");
//		address1.setCountry("India");
//		address1.setStudentOneToMany(studentOnetoMay);
//		Address address2= new Address();
//		address2.setCity("Wadsa");
//		address2.setCountry("India");
//		address2.setStudentOneToMany(studentOnetoMay);
//		List<Address> addresses=List.of(address1,address2);
//		studentOnetoMay.setAddress(addresses);
//		studentOneToManyDAO.save(studentOnetoMay);
		// OneToMany Mapping End



	}
}
