package com.Employee.EmployeeSystem.Controller;

import com.Employee.EmployeeSystem.Error.EmployeeFoundException;
import com.Employee.EmployeeSystem.entity.Employee;
import com.Employee.EmployeeSystem.service.EmployeeServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Employee.EmployeeSystem.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
   // @RequestMapping(value="/hello",method= RequestMethod.GET)
    @Autowired
    private EmployeeService employeeService;

    private final Logger LOGGER= LoggerFactory.getLogger(EmployeeController.class);
    @GetMapping("/hello")
    public String HelloWorld(){
     return "Welcome to Employee";
    }

    @PostMapping("/Employee")
    public Employee SaveEmployee(@Valid @RequestBody Employee employee){
     LOGGER.info("Inside SaveEmployee of Employee Controller");
     return employeeService.SaveEmployee(employee);
    }
    @GetMapping("/Employee")
    public List<Employee>fetchEmployeeList(){
     LOGGER.info("Inside fetchEmployeeList of Employee Controller");
     return employeeService.fatchEmployeeList();
    }

    @GetMapping("/Employee/{id}")
    public List<Employee>fetchEmployeeListById(@PathVariable("id") long employeeId) throws EmployeeFoundException {
     LOGGER.info("Inside fetchEmployeeListById of Employee Controller");
    return employeeService.fatchEmployeeListById(employeeId);
 }
    @DeleteMapping ("/Employee/{id}")
     public String deleteEmployeeById(@PathVariable("id") long employeeId){
     LOGGER.info("Inside deleteEmployeeById of Employee Controller");
     employeeService.deleteEmployeeById(employeeId);
     return "Employee Deleted Sucessfully";
     }
     @PutMapping("/Employee/{id}")
     public Employee updateEmployeeById(@PathVariable("id") long employeeId,@RequestBody Employee employee){
       LOGGER.info("Inside updateEmployeeById of Employee Controller");
       return employeeService.updateEmployeeById(employeeId,employee);
     }

     //Implement fatchEmployeeListByName
     @GetMapping("/Employee/name/{name}")
     public Employee fetchEmployeeListByName(@PathVariable("name") String employeeName){
      LOGGER.info("Inside fetchEmployeeListByName of Employee Controller");
     return employeeService.fatchEmployeeListByName(employeeName);
     }
}
