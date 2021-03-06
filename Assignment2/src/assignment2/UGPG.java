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
class UGPG extends student  //derived class
{
    private String specialization, thesisArea, dept;
    private int CGPA, year;
    
    UGPG(String course, String roll, String name, String dept, String specialization, int regPeriod, int CGPA, int credits, String thesisArea, int year) //constructor
    {
        super(course, roll, name, regPeriod, credits);   //call to base class constructor
        this.dept = dept;
        this.CGPA = CGPA;
        this.specialization = specialization;
        this.thesisArea = thesisArea;
        this.year = year;
        setGradStatus(regPeriod, credits);
    }
    
    void setGradStatus(int regPeriod, int credits)  //to set the graduating status of student
    {
        if((regPeriod>=5&&regPeriod<=8)&&credits>=265)
            super.setGradStatus();
    }
    
    @Override
    void display()
    {
        if(super.getGradStatus() == 1)
        {
            System.out.println(super.getRollNumber()+" "+super.getName()+" "+super.getCourse()+" "+this.dept+" "+this.specialization+" "+this.CGPA);
        }
    }
    
    
    void setDept(String s)
    {
        this.dept = s;
    }
    
    void setSpe(String s)
    {
        this.specialization = s;
    }
    
    void setCGPA(int s)
    {
        this.CGPA = s;
    }
    
    void setThesis(String s)
    {
        this.thesisArea = s;
    }
    
    void setYear(int s)
    {
        this.year = s;
    }
    
    String getDept()
    {
        return this.dept;
    }
    
    String getSpe(String s)
    {
        return this.specialization;
    }
    
    int getCGPA()
    {
        return this.CGPA;
    }
    
    String getThesis()
    {
        return this.thesisArea;
    }
    
    int getYear()
    {
        return this.year;
    }
}//end of UGPG class
