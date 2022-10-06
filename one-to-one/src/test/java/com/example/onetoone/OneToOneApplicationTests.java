package com.example.onetoone;

import com.example.onetoone.repository.CourseMaterialRepository;
import com.example.onetoone.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToOneApplicationTests {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    void test_1() {
        courseRepository.findAll().forEach(s -> {
            System.out.println(s);
        });
    }

    @Test
    void test_2() {
        courseMaterialRepository.findAll().forEach(s -> {
            System.out.println(s);
        });
    }

}
