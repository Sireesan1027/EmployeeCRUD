package com.Employee.EmployeeSystem.service;

import com.Employee.EmployeeSystem.entity.Employee;
import com.Employee.EmployeeSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee SaveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fatchEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> fatchEmployeeListById(long employeeId) {
        return employeeRepository.findAllById(Collections.singletonList(employeeId));
    }

    @Override
    public void deleteEmployeeById(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee updateEmployeeById(long employeeId, Employee employee) {
        Employee EmpDb= employeeRepository.findById(employeeId).get();
        if(Objects.nonNull(employee.getEmpName())&&!" ".equalsIgnoreCase(employee.getEmpName())){
             EmpDb.setEmpName(employee.getEmpName());
        }
        if(Objects.nonNull(employee.getEmail())&&!" ".equalsIgnoreCase(employee.getEmail())){
            EmpDb.setEmail(employee.getEmail());
        }
        return employeeRepository.save(EmpDb);

    }

    @Override
    public Employee fatchEmployeeListByName(Employee employeeName) {
        return employeeRepository.findByEmpName(employeeName);
    }


}
