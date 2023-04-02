package com.Employee.EmployeeSystem.repository;

import com.Employee.EmployeeSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByEmpName(Employee employeeName);
}
