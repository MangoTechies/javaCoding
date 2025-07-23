package com.arjita.SimpleAppApplication.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
