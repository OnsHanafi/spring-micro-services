package com.groot.student.repositories;

import com.groot.student.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student,Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
