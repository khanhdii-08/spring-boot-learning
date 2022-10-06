package com.example.manytomany.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EmployeeProjectPK implements Serializable {
    private int employee;
    private int project;
}
