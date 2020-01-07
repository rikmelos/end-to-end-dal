package com.richard.student.dal;

import com.richard.student.dal.entities.Student;
import com.richard.student.dal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

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
        student.setName("student test");
        student.setCourse("course test");
        student.setFee(30d);

        studentRepository.save(student);
    }

    @Test
    public void testFindStudenTById(){
        Optional<Student> student = studentRepository.findById(3L);
        student.map( student1 -> {
            System.out.println( student1 );
            return student1;
        });
    }

    @Test
    public void testUpdateStudent(){
        Optional<Student> student = studentRepository.findById(1L);
        student.map( student1 -> {
            student1.setFee(50d);
            return studentRepository.save(student1);
        });
    }
    
    @Test
    public void testDeleteStudent(){
        Student student = new Student();
        student.setId(7L);
        studentRepository.delete(student);
    }
}
