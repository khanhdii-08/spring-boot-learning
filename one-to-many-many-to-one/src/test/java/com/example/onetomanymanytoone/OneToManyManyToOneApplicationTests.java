package com.example.onetomanymanytoone;

import com.example.onetomanymanytoone.repository.CompanyRepository;
import com.example.onetomanymanytoone.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToManyManyToOneApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CompanyRepository companyRepository;


    @Test
    void test_1() {
        employeeRepository.findAll().forEach(e -> {
            System.out.println(e);
        });
    }

    @Test
    void test_2() {
        companyRepository.findAll().forEach(c -> {
            System.out.println(c);
        });
    }

}
