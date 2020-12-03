package com.example.demo1;

import java.net.URI; 
import org.springframework.beans 
    .factory.annotation.Autowired; 
import org.springframework.http 
    .ResponseEntity; 
import org.springframework.web.bind 
    .annotation.GetMapping; 
import org.springframework.web.bind 
    .annotation.PostMapping; 
import org.springframework.web.bind 
    .annotation.RequestBody; 
import org.springframework.web.bind 
    .annotation.RequestMapping; 
import org.springframework.web.bind 
    .annotation.RestController; 
import org.springframework.web.servlet 
    .support.ServletUriComponentsBuilder; 
  
// Import the above-defined classes 
// to use the properties of those 
// classes 
import com.example.demo1.Students; 
import com.example.demo1.StudentDAO; 
import com.example.demo1.Student; 
  
// Creating the REST controller 
@RestController
@RequestMapping(path = "/students") 

public class StudentController {
	
    @Autowired
   private StudentDAO studentDao; 
        
        // Implementing a GET method 
        // to get the list of all 
        // the students 
   @GetMapping( 
        path = "/", 
        produces = "application/json") 
  
    public Students getStudents() 
    { 
  
        return studentDao 
            .getAllStudents(); 
    } 
  
        
        // Create a POST method 
        // to add a student
        // to the list 
   @PostMapping( 
        path = "/", 
        consumes = "application/json", 
        produces = "application/json") 
  
    public ResponseEntity<Object> addStudent( 
        @RequestBody Student student) 
    { 
  
        // Creating an ID of a student 
        // from the number of students 
        Integer id 
            = studentDao 
                  .getAllStudents() 
                  .getStudentList() 
                  .size() 
              + 1; 
  
        student.setId(id); 
  
        studentDao 
            .addStudent(student); 
  
        URI location 
            = ServletUriComponentsBuilder 
                  .fromCurrentRequest() 
                  .path("/{id}") 
                  .buildAndExpand( 
                      student.getId()) 
                  .toUri(); 
  
               return ResponseEntity 
            .created(location) 
            .build(); 
    } 


}
