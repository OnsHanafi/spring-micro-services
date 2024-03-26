package com.groot.student.repositories;

import com.groot.student.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
}
