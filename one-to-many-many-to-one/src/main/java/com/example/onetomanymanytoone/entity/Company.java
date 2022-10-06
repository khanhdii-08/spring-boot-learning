package com.example.onetomanymanytoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_company")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "employeeList")
public class Company {
    @Id
    @Column(name = "id", columnDefinition = "varchar(9)")
    private String id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "company")
    private List<Employee> employeeList;
}
