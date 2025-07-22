package com.arjita.FoodAppApplication.Controller.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Employee {
    private Long id;
    private String name;
    private String department;
}
