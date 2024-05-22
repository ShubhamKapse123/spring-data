package com.springapp.springdata.repositories;

import com.springapp.springdata.onetoone.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student,String> {
}
