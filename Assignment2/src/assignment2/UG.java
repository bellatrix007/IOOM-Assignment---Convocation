package assignment2;


import assignment2.student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditi
 */
class UG extends student    //derived class   
{
    private int CGPA;
    private String dept;
    
    UG(String course, String roll, String name, String dept,int regPeriod, int CGPA, int credits)    //constructor
    {
        super(course, roll, name, regPeriod, credits);   //call to base class constructor
        this.dept = dept;
        this.CGPA = CGPA;
        setGradStatus(regPeriod, credits);
    }
    
    void setGradStatus(int regPeriod, int credits)  //to set if the student is graduating
    {
        if((regPeriod>=4&&regPeriod<=7)&&credits>=185)
            super.setGradStatus();
    }
    
    @Override
    void display()
    {
        if(super.getGradStatus() == 1)
        {
            System.out.println(super.getRollNumber()+" "+super.getName()+" "+super.getCourse()+" "+this.dept+" "+this.CGPA);
        }
    }
    void setDept(String s)
    {
        this.dept = s;
    }
    
    void setCGPA(int s)
    {
        this.CGPA = s;
    }
    
    String getDept()
    {
        return this.dept;
    }
    
    int getCGPA()
    {
        return this.CGPA;
    }
    
}//end of UG class
