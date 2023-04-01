package com.Employee.EmployeeSystem.service;

import com.Employee.EmployeeSystem.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
   public Employee SaveEmployee(Employee employee);

   public List<Employee> fatchEmployeeList();

   public List<Employee> fatchEmployeeListById(long employeeId);

    public void deleteEmployeeById(long employeeId);


    Employee updateEmployeeById(long employeeId, Employee employee);
}
