package com.arjita.FoodAppApplication.Controller;

import com.arjita.FoodAppApplication.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.arjita.FoodAppApplication.Controller.response.Employee;

@RestController
@RequestMapping("/v1/details")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employees/{id}")
  public Employee getEmployees(@PathVariable Long id){
      return employeeService.getEmployeeDetails(id);
  }
}
