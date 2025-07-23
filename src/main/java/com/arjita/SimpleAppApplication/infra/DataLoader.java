package com.arjita.SimpleAppApplication.infra;

import com.arjita.SimpleAppApplication.Controller.response.Employee;
import com.arjita.SimpleAppApplication.Domain.EmployeeDetails;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataLoader {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostConstruct
    public void init() {
        List<Employee> employeeList = List.of(
                new Employee( 1,"Emp1", "OFS"),
                new Employee(2, "Arjita", "Mango"),
                new Employee( 3, "Emp2", "Mango")
        );
        employeeRepository.addEmployees(employeeList);
        System.out.println("Initial employee data inserted.");
    }
}
