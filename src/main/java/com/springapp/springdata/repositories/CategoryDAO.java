package com.springapp.springdata.repositories;

import com.springapp.springdata.manytomany.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDAO extends CrudRepository<Category,String> {
}
