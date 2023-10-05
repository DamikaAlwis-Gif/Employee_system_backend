package com.example.employee_system.controller;

import com.example.employee_system.model.Employee;
import com.example.employee_system.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000") // let this origin access this API
@RestController
@RequestMapping("/api/v1/") // base url path for the all teh endpoints in the controller

public class  EmployeeController {
    private final EmployeeService employeeService;
    // constructor
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees") // this method should handle post request from "/employees" endpoint
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    // function to get all the employees in the database
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployeees();
    };

    //function for delete an employee by id
    @DeleteMapping("/employees/{id}") // {} implies the path variable we can get that value as a arguement for the function
    public ResponseEntity<Map<String,Boolean>> deleteEmployee( @PathVariable Long id){
      boolean deleted = false;
      deleted = employeeService.deleteEmployee(id);
      Map<String,Boolean> response = new HashMap<>();
      response.put("deleted", deleted);
      return ResponseEntity.ok(response);
    };
    // get an employee by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        Employee employee = null;
        employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);

    };
    // update an employee
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        employee =employeeService. updateEmployee(id, employee);

        return ResponseEntity.ok(employee);
    };
}

//    A controller is responsible for handling incoming HTTP requests, processing them,
//        and returning an appropriate HTTP response. It acts as an intermediary between
//        the client (e.g., a web browser or mobile app) and the application's business logic.
// in the service containes the business logic