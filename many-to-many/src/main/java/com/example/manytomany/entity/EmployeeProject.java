package com.example.manytomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "employee_project")
@IdClass(EmployeeProjectPK.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class EmployeeProject {
    @Id
    @ManyToOne
    @JoinColumn(name ="employee_id")
    private Employee  employee;

    @Id
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;


}
