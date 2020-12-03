package com.example.demo1;

import org.springframework 
.stereotype 
.Repository; 

//Importing the employees class to 
//use the defined properties 
//in this class 
import com.example.demo1.Students; 

@Repository

//Class to create a list 
//of students


public class StudentDAO {
	
	private static Students list 
    = new Students(); 

// This static block is executed 
// before executing the main 
// block 
static
{ 

    // Creating a few students
    // and adding them to the list 
    list.getStudentList().add( 
        new Student( 
            1, 
            "Prem", 
            "Tiwari", 
            "chapradreams@gmail.com")); 

    list.getStudentList().add( 
        new Student( 
            2, "Vikash", 
            "Kumar", 
            "abc@gmail.com")); 

    list.getStudentList().add( 
        new Student( 
            3, "Ritesh", 
            "Ojha", 
            "asdjf@gmail.com")); 

        
} 

// Method to return the list 
public Students getAllStudents() 
{ 

    return list; 
} 

    
    // Method to add an employee 
    // to the students list 
    public void
    addStudent(Student student) 
{ 
    list.getStudentList() 
        .add(student); 
        
} 

}
