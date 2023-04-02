package com.Employee.EmployeeSystem.Controller;

import com.Employee.EmployeeSystem.entity.Employee;
import com.Employee.EmployeeSystem.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Employee.EmployeeSystem.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
   // @RequestMapping(value="/hello",method= RequestMethod.GET)
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/hello")
    public String HelloWorld(){
       return "Welcome to Employee";
    }

    @PostMapping("/Employee")
    public Employee SaveEmployee(@RequestBody Employee employee){
     return employeeService.SaveEmployee(employee);
    }
    @GetMapping("/Employee")
    public List<Employee>fetchEmployeeList(){
     return employeeService.fatchEmployeeList();
    }

    @GetMapping("/Employee/{id}")
    public List<Employee>fetchEmployeeListById(@PathVariable("id") long employeeId){
    return employeeService.fatchEmployeeListById(employeeId);
 }
    @DeleteMapping ("/Employee/{id}")
     public String deleteEmployeeById(@PathVariable("id") long employeeId){
     employeeService.deleteEmployeeById(employeeId);
     return "Employee Deleted Sucessfully";
     }
     @PutMapping("/Employee/{id}")
     public Employee updateEmployeeById(@PathVariable("id") long employeeId,@RequestBody Employee employee){
       return employeeService.updateEmployeeById(employeeId,employee);
     }


     @GetMapping("/Employee/name/{name}")
     public Employee fetchEmployeeListById(@PathVariable("name") Employee employeeName){
     return employeeService.fatchEmployeeListByName(employeeName);
     }
}
