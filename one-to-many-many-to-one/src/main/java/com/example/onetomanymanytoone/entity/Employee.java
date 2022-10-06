package com.example.onetomanymanytoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "company")
public class Employee {
    @Id
    @Column(name = "employeeid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeid;

//    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;
    private String first_name;
    private String last_name;

    @ManyToOne
    @JoinColumn(name = "companyid")
    private Company company;

}
