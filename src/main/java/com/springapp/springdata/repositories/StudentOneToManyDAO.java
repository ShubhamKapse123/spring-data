package com.springapp.springdata.repositories;


import com.springapp.springdata.onetomany.StudentOneToMany;
import org.springframework.data.repository.CrudRepository;

public interface StudentOneToManyDAO extends CrudRepository<StudentOneToMany,String> {
}
