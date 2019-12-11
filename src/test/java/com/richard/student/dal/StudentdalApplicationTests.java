package com.richard.student.dal;

import com.richard.student.dal.entities.Student;
import com.richard.student.dal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentdalApplicationTests {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateStudent(){
        Student student = new Student();
        student.setName("John");
        student.setCourse("Java Web Service");
        student.setFee(30d);

        studentRepository.save(student);
    }

}
