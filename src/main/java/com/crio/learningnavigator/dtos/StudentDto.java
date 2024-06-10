package com.crio.learningnavigator.dtos;

import java.util.List;
import lombok.Data;


@Data
public class StudentDto {
    private String name;
    private List<String> subjectNames;
    private List<String> examNames;

    // Getters and Setters
}
