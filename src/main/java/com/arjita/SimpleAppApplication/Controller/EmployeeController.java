package com.arjita.SimpleAppApplication.Controller;

import com.arjita.SimpleAppApplication.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.arjita.SimpleAppApplication.Controller.response.Employee;

@RestController
@RequestMapping("/v1/details")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employees/{id}")
  public Employee getEmployees(@PathVariable int id){
      return employeeService.getEmployeeDetails(id);
  }
}
