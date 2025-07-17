package com.CURD.Student.repository;

import com.CURD.Student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Long> {

}
