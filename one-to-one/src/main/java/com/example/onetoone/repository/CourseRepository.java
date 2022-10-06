package com.example.onetoone.repository;

import com.example.onetoone.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, String> {
}
