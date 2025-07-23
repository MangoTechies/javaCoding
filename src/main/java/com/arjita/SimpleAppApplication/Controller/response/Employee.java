package com.arjita.SimpleAppApplication.Controller.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Employee {
    private int id;
    private String name;
    private String department;
}
