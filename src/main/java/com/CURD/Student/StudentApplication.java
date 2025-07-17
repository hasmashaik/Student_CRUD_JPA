package com.CURD.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		
		/*http://localhost:8080/student  -get(AllStudents)
		 * *http://localhost:8080/student  -post(CreateStudent)
		 * *http://localhost:8080/student/10  -get(getStudentsById)
		 * *http://localhost:8080/student/10  -put(updateStudents)
		 * *http://localhost:8080/student/10  -delete(deleteStudents)
		 * */
		
		/* url(browser/postman) -> controller layer ->service layer -> Repository layer ->DB
		 * */
	}

}
