package com.example.manytomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "employeeProjectList")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String first_name;
    private String last_name;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeProject> employeeProjectList;
}
