package com.testjava.springbootbackend.repository;

import com.testjava.springbootbackend.model.Employee;
import com.testjava.springbootbackend.model.Physician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

    // all crud database methods test

}
