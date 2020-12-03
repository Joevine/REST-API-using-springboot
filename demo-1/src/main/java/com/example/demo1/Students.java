package com.example.demo1;


import java.util.ArrayList; 
import java.util.List; 

public class Students {
	private List<Student> studentList; 
	  
    // Method to return the list 
    // of employees 
    public List<Student> getStudentList() 
    { 
  
        if (studentList == null) { 
  
            studentList 
                = new ArrayList<>(); 
  
                    
        } 
  
        return studentList; 
  
            
    } 
  
    public void
    setStudentList( 
        List<Student> studentList) 
    { 
        this.studentList 
            = studentList; 
    } 

}
