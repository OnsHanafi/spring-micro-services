package com.groot.school.repositories;

import com.groot.school.entities.School;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolRepository extends MongoRepository<School,Integer> {
}
