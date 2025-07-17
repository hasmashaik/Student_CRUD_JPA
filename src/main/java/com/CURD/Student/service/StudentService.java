package com.CURD.Student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CURD.Student.model.Student;
import com.CURD.Student.repository.StudentRepository;

@Service
public class StudentService {
	 private StudentRepository studentRepository; 
	 
	    public StudentService(StudentRepository studentRepository) { 
	        this.studentRepository = studentRepository; 
	    } 
	 
	    public Student createStudent(Student student) { 
	        return studentRepository.save(student); 
	    } 
	 
	    public List<Student> getAllStudents() { 
	        return studentRepository.findAll(); 
	    } 
	 
	    public Student getStudentById(Long id) { 
	        Student student = studentRepository.findById(id).orElse(null); 
	        if (student != null) { 
	            return student; 
	        } else { 
	            throw new RuntimeException("Student not found with ID: " + id); 
	        } 
	    } 
	 
	    public Student updateStudent(Long id, Student updatedStudent) { 
	        Student existingStudent = studentRepository.findById(id).orElse(null); 
	        if (existingStudent != null) { 
	            existingStudent.setName(updatedStudent.getName()); 
	            existingStudent.setEmail(updatedStudent.getEmail()); 
	            existingStudent.setAge(updatedStudent.getAge()); 
	            return studentRepository.save(existingStudent); 
	        } else { 
	            throw new RuntimeException("Student not found with ID: " + id); 
	        } 
	    } 
	 
	    public void deleteStudent(Long id) { 
	        Student student = studentRepository.findById(id).orElse(null); 
	        if (student != null) { 
	            studentRepository.deleteById(id); 
	        } else { 
	            throw new RuntimeException("Student not found with ID: " + id); 
	        } 
	    } 
}
