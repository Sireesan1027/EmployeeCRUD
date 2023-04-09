package com.Employee.EmployeeSystem.service;

import com.Employee.EmployeeSystem.Error.EmployeeFoundException;
import com.Employee.EmployeeSystem.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
   public Employee SaveEmployee(Employee employee);

   public List<Employee> fatchEmployeeList();

   public List<Employee> fatchEmployeeListById(long employeeId) throws EmployeeFoundException;

    public void deleteEmployeeById(long employeeId);


   public Employee updateEmployeeById(long employeeId, Employee employee);

   public Employee fatchEmployeeListByName(String employeeName);
}
