package com.groot.school.entities;

import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {

    private String name;
    private String email;
    private List<Student> students;
}
