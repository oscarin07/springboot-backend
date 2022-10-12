package com.testjava.springbootbackend.repository;

import com.testjava.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // all crud database methods

}
