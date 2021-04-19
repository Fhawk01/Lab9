/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
class GraduateStudent extends Student
{  
    private String type;
 
    public String getType() {
        return this.type ;
    }
 
    public void setType(String Type) {
        this.type = Type;
    }
    
    // Default Constructor of GraduateStudent Class
    public GraduateStudent()
    {
        // Calling the parameterized constructor of Student class
        super("101","Alex","Pandian");
        

        // initializing value of type inside constructor
        type = "";
    }
}  

