package com.groot.school.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String email;

}
