package com.testjava.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Physician {
    @Id
    @Column(name = "EmployeeID", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 30)
    private String name;

    @Column(name = "Position", nullable = false, length = 30)
    private String position;

    @Column(name = "SSN", nullable = false)
    private Integer ssn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

}