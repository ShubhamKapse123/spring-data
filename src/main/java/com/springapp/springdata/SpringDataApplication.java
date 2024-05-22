package com.springapp.springdata;

import com.springapp.springdata.manytomany.Category;
import com.springapp.springdata.manytomany.Product;
import com.springapp.springdata.onetomany.Address;
import com.springapp.springdata.onetomany.StudentOneToMany;
import com.springapp.springdata.repositories.CategoryDAO;
import com.springapp.springdata.repositories.StudentDAO;
import com.springapp.springdata.repositories.StudentOneToManyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	@Autowired
	private StudentDAO studentDAO;

	@Autowired
	private StudentOneToManyDAO studentOneToManyDAO;

	@Autowired
	private CategoryDAO categoryDAO;

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

 // many to many mapping start

//		Product product= new Product();
//		product.setProdId("10001");
//		product.setProdName("Nokia");
//		Product product1= new Product();
//		product1.setProdId("10002");
//		product1.setProdName("LG");
//		Product product2= new Product();
//		product2.setProdId("10003");
//		product2.setProdName("Sha");
//
//		Category mob= new Category();
//		mob.setCatID("101");
//		mob.setCatName("Mobile");
//		List<Product> mobiles=new ArrayList<>();
//		mobiles.add(product);
//		mobiles.add(product1);
//		mobiles.add(product2);
//		mob.setProduct(mobiles);
//
//		Category ac= new Category();
//		ac.setCatID("102");
//		ac.setCatName("ac");
//		List<Product> acProduct=new ArrayList<>();
//		acProduct.add(product2);
//		acProduct.add(product1);
//		ac.setProduct(acProduct);
//
//		categoryDAO.save(mob);
//		categoryDAO.save(ac);

		//getting

//		Optional<Category> category= categoryDAO.findById("101");
//		List<Product> products=category.get().getProduct();
//		products.forEach(p->System.out.println(p.getProdName()+"-"+p.getProdId()));

// many to many mapping end

	}
}
