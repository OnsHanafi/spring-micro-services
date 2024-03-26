package com.groot.school.controllers;

import com.groot.school.entities.School;
import com.groot.school.services.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void setStudent(@RequestBody School school) {
        this.schoolService.saveSchool(school);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<School>> setSchool() {
        return ResponseEntity.ok(this.schoolService.findAllSchools());
    }
}
