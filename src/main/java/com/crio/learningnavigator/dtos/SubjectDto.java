package com.crio.learningnavigator.dtos;

import java.util.List;
import lombok.Data;


@Data
public class SubjectDto {
    private String name;
    private List<String> studentNames;
    // Getters and Setters
}
