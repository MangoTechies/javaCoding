//package com.arjita.FoodAppApplication.services;
//
//import com.arjita.FoodAppApplication.Controller.ResourceNotFoundException;
//import com.arjita.FoodAppApplication.Controller.response.Employee;
//import com.arjita.FoodAppApplication.Domain.EmployeeDetails;
//import com.arjita.FoodAppApplication.infra.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    public Employee getEmployeeDetails(Long id) {
//
//        Optional<EmployeeDetails> employeeDetails = employeeRepository.findById(id);
//
//        if (employeeDetails.isPresent()) {
//            System.out.println("Enitity found with id: " + id);
//            return Employee.builder()
//                    .id(employeeDetails.get().getId())
//                    .name(employeeDetails.get().getName())
//                    .department(employeeDetails.get().getDepartment())
//                    .build();
//        }
//        else {
//            throw new ResourceNotFoundException("Employee not found with id" + id);
//        }
//    }
//
//}
