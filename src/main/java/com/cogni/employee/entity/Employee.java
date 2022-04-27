package com.cogni.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long employeeId;
    String employeeFirstName;
    String employeeLastName;
    String employeePhone;
    String employeeLocation;
    String employeeEmail;

}
