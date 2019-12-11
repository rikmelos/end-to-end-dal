package com.richard.student.dal.repos;

import com.richard.student.dal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

//    for spring documentation about jpa respository

}
