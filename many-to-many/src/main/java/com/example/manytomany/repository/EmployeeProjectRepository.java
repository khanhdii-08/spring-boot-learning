package com.example.manytomany.repository;

import com.example.manytomany.entity.Employee;
import com.example.manytomany.entity.EmployeeProject;
import com.example.manytomany.entity.EmployeeProjectPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject, EmployeeProjectPK> {
}
