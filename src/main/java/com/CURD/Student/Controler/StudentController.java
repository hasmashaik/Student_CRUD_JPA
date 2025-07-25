package com.CURD.Student.Controler;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CURD.Student.model.Student;
import com.CURD.Student.service.StudentService;

@RestController 
@RequestMapping("/students") 
public class StudentController {
	 private StudentService studentService; 
	 
	    public StudentController(StudentService studentService) { 
	        this.studentService = studentService; 
	    } 
	 
	    @PostMapping 
	    public Student createStudent(@RequestBody Student student) { 
	        return studentService.createStudent(student); 
	    } 
	 
	    @GetMapping 
	    public List<Student> getAllStudents() { 
	        return studentService.getAllStudents(); 
	    } 
	 
	    @GetMapping("/{id}") 
	    public Student getStudentById(@PathVariable Long id) { 
	        return studentService.getStudentById(id); 
	    } 
	 
	    @PutMapping("/{id}") 
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student 
	updatedStudent) { 
	        return studentService.updateStudent(id, updatedStudent); 
	    } 
	 
	    @DeleteMapping("/{id}") 
	    public String deleteStudent(@PathVariable Long id) { 
	        studentService.deleteStudent(id); 
	        return "Student deleted successfully"; 
	    }

}
