package com.arjita.FoodAppApplication.infra;

import com.arjita.FoodAppApplication.Domain.EmployeeDetails;
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
        List<EmployeeDetails> employeeList = List.of(
                new EmployeeDetails( 1L,"Khushahal", "OFS"),
                new EmployeeDetails(22L, "Arjita", "Mango"),
                new EmployeeDetails( 23L, "Thermameter", "OFS++")
        );
        employeeRepository.saveAll(employeeList);
        System.out.println("Initial employee data inserted.");
    }
}
