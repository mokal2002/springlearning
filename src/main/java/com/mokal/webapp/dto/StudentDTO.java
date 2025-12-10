package com.mokal.webapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
}
