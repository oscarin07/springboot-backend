package com.testjava.springbootbackend.controller;

import com.testjava.springbootbackend.model.Physician;
import com.testjava.springbootbackend.repository.PhysicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/physicians")
public class PhysicianController {

    @Autowired
    private PhysicianRepository physicianRepository;

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping
    public List<Physician> getAllPhysicians(){
        return physicianRepository.findAll();
    }

    @PostMapping
    public Physician createPhysician(@RequestBody Physician physician){
        return physicianRepository.save(physician);
    }

    @PostMapping("/add")
    public int createPhysicians(@RequestBody List<Physician> physician){
        List<Physician> result = new ArrayList<Physician>();

        for (Physician p :  physician) {
            physicianRepository.save(p);
            result.add(p);
        }
        return result.size();
    }

}
