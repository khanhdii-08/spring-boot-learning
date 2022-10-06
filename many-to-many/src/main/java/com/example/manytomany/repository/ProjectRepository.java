package com.example.manytomany.repository;

import com.example.manytomany.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
