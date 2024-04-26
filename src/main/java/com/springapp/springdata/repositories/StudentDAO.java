package com.springapp.springdata.repositories;

import com.springapp.springdata.entites.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student,Integer> {
}
