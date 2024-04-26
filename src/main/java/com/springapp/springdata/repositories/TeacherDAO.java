package com.springapp.springdata.repositories;

import com.springapp.springdata.entites.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface TeacherDAO extends MongoRepository<Teacher,Long> {
}
