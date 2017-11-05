package assignment2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditi
 */
class student
{
    private String name,roll,course;
    private int regPeriod, credits, gradFlag;
    private static int count = 0;   //to store number of graduating students
    
    student()   //default constructor
    {
        this.course = "";
        this.name = "";
        this.roll = "";
        this.regPeriod = 0;
        this.credits = 0;
        this.gradFlag = 0;
    }
    
    student(String course, String roll, String name, int regPeriod, int credits) //parameterized constructor
    {
        this.course = course;
        this.name = name;
        this.roll = roll;
        this.regPeriod = regPeriod;
        this.credits = credits;
        this.gradFlag = 0;
    }
    
    void display()  //will be overriden by the derived classes
    {
    }
    //setters
    
    void setCourse(String s)
    {
        this.course = s;
    }
    
    void setRoll(String s)
    {
        this.roll = s;
    }
    
    void setName(String s)
    {
        this.name = s;
    }
    
    void setDept(String s)
    {
        
    }
    
    void setSpe(String s)
    {
        
    }
    
    void setReg(int s)
    {
        this.regPeriod = s;
    }
    
    void setCGPA(int s)
    {
        
    }
    
    void setCredits(int s)
    {
        this.credits = s;
    }
    
    void setThesis(String s)
    {
        
    }
    
    void setYear(int s)
    {
        
    }
    
    void setGradStatus()
    {
        this.gradFlag = 1;
        count++;
    }
    
    static void setCount()
    {
        count = 0;
    }
    
    //getters
    static int getCount()
    {
        return count;
    }
    
    int getGradStatus()
    {
        return this.gradFlag;
    }
    
    String getRollNumber()
    {
        return this.roll;
    }
    
    String getCourse()
    {
        return this.course;
    }
    
    String getName()
    {
        return this.name;
    }
    
    int getCredits()
    {
        return this.credits;
    }
   
}//end of student class