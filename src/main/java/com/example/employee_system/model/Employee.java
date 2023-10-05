package com.example.employee_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor// a constructor with all arguements
@NoArgsConstructor // a constuctor with no arguements
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
