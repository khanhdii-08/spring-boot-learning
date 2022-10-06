package com.example.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "course")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    @Id
    @Column(name = "course_id", columnDefinition = "varchar(9)")
    private String course_id;
    private int credit;
    private String title;

}
