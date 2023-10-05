package com.example.employee_system.repository;

import com.example.employee_system.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// this is a spring data repository
// by extending JpaRepository EmployeeRepository interface will inherit a
// set of common database operations (e.g., save, delete, findById) for the EmployeeEntity
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}


