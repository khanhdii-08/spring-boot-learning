package com.example.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "course_material")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseMaterialId;
    private String url;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
