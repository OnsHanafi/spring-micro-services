package com.groot.school.services;

import com.groot.school.client.StudentClient;
import com.groot.school.entities.FullSchoolResponse;
import com.groot.school.entities.School;
import com.groot.school.repositories.SchoolRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;


    public void saveSchool(School school){
        schoolRepository.save(school);
    }

    public List<School> findAllSchools(){
      return   schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {

        var school = schoolRepository.findById(schoolId)
                                        .orElse(
                                                School.builder()
                                                        .name("NOT_FOUND")
                                                        .email("NOT_FOUND")
                                                        .build()
                                        );

        var students = studentClient.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
