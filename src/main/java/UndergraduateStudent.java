/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
class UndergraduateStudent extends Student
{  
    private int year;
 
    public int getYear() {
        return this.year ;
    }
 
    public void setYear(int Year) {
        this.year = Year;
    }
    
     // Default Constructor of UndergraduateStudent Class
    public UndergraduateStudent()
    {
        // Calling the default constructor of Student class
        super();
        

        // initializing value of year inside constructor
        year = 2021;
    }
}  
