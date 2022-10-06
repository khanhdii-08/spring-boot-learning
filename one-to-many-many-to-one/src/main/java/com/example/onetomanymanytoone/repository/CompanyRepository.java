package com.example.onetomanymanytoone.repository;

import com.example.onetomanymanytoone.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CompanyRepository extends JpaRepository<Company, String> {
}
