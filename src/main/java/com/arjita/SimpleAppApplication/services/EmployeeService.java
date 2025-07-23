package com.arjita.SimpleAppApplication.services;

import com.arjita.SimpleAppApplication.Controller.ResourceNotFoundException;
import com.arjita.SimpleAppApplication.Controller.response.Employee;
import com.arjita.SimpleAppApplication.Domain.EmployeeDetails;
import com.arjita.SimpleAppApplication.infra.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeDetails(int id) {

        Employee employeeDetails = employeeRepository.findById(id);

            System.out.println("Enitity found with id: " + id);
            return Employee.builder()
                    .id(employeeDetails.getId())
                    .name(employeeDetails.getName())
                    .department(employeeDetails.getDepartment())
                    .build();
    }

}
