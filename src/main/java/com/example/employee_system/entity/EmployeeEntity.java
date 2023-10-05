package com.example.employee_system.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity // this is a table
@Data // set getters and setters
@Table(name = "employees") //employees table
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //primary key
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;

}
