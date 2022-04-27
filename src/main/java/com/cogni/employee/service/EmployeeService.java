package com.cogni.employee.service;

import com.cogni.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);


    List<Employee> listEmployee();

    Employee fetchEmployeeById(Long employeeID);

    String deleteEmployee(Long employeeID);

    Employee editEmployee(Long employeeID, Employee employee);
}
