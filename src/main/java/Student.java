/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class Student {
    private String studentID;
 
    public String getStudentID() {
        return this.studentID;
    }
 
    public void setStudentID(String studentid) {
        this.studentID = studentid;
    }
    
    
    private String firstName;
 
    public String getFirstName() {
        return this.firstName ;
    }
 
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
    
    
    private String lastName;
 
    public String getLastName() {
        return this.lastName;
    }
 
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
    
    // Parameterized Constructor of Student Class
    public Student(String studentid, String firstname,String lastname)
    {
        studentID = studentid;
        firstName = firstname;
        lastName = lastname;
    }
    
    // Default Constructor of Student Class
    public Student()
    {
        studentID = "";
        firstName = "";
        lastName = ""; 
    }
}
