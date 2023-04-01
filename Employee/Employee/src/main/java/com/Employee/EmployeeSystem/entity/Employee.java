package com.Employee.EmployeeSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;
    private String empName;
    private String email;

    public Employee() {
    }

    public Employee(long employeeId, String empName, String email) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.email = email;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + employeeId +
                ", EmpName='" + empName + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
