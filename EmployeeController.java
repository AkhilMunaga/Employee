package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/Employees")
    public List<Employees> getAllEmployees(){
        
        return employeeService.getAllEmployees();
    }
    @RequestMapping("/Employees/{id}")
    public Employees getEmployees(@PathVariable String id){
        
        return employeeService.getEmployees(id);
    }
    @RequestMapping(method = RequestMethod.POST, value="/Employees")
    public void addEmployees(@RequestBody Employees employees){

        employeeService.addEmployees(employees);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/Employees/{id}")
    public void UpdateEmployees(@RequestBody Employees employees,@PathVariable String id) {
        employeeService.updateEmployees(id,employees);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/Employees/{id}")
    public void deleteEmployees( @PathVariable String id){
        employeeService.deleteEmployees(id);

    }
}



