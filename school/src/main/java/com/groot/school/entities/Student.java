package com.groot.school.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String firstname;
    private String lastname;
    private String email;
}
