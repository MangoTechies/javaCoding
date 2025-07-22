package com.arjita.FoodAppApplication.Domain;

import com.arjita.FoodAppApplication.infra.OrderManager;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails {

    @Id
    private Long id;
    private String name;
    private String department;

}
