package com.cogni.employee.controller;

import com.cogni.employee.entity.Employee;
import com.cogni.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> listEmployee(){
        return employeeService.listEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee fetchEmployeeById(@PathVariable("id") Long employeeID){
        return employeeService.fetchEmployeeById(employeeID);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Long employeeID){
        return employeeService.deleteEmployee(employeeID);
    }

    @PutMapping("/employee/{id}")
    public Employee editEmployee(@PathVariable("id") Long employeeID,@RequestBody Employee employee){
        return employeeService.editEmployee(employeeID,employee);
    }




}
