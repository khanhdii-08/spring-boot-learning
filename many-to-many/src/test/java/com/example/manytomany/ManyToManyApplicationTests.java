package com.example.manytomany;

import com.example.manytomany.repository.EmployeeProjectRepository;
import com.example.manytomany.repository.EmployeeRepository;
import com.example.manytomany.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManyToManyApplicationTests {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EmployeeProjectRepository employeeProjectRepository;


    @Test
    void test_1() {
        employeeRepository.findAll().forEach(s -> {
            System.out.println(s);
        });
    }

    @Test
    void test_2() {
        projectRepository.findAll().forEach(s -> {
            System.out.println(s);
        });
    }

    @Test
    void test_3() {
        employeeProjectRepository.findAll().forEach(s -> {
            System.out.println(s);
        });
    }

}
