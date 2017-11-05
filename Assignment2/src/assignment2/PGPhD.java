/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Aditi
 */
class PGPhD extends student //derived class
{
    private String thesisArea;
    private int CGPA, year;
    
    PGPhD(String course, String roll, String name, int regPeriod, int CGPA, int credits, String thesisArea, int year)    //constructor
    {
        super(course, roll, name, regPeriod, credits);   //call to base class constructor
        this.thesisArea = thesisArea;
        this.CGPA = CGPA;
        this.year = year;
        setGradStatus(regPeriod, credits);
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
    
    void setGradStatus(int regPeriod, int credits)  //to set the graduating status of student
    {
        if((regPeriod>=4&&regPeriod<=7)&&credits>=138)
            super.setGradStatus();
    }
    
    @Override
    void display()  
    {
        if(super.getGradStatus() == 1)
        {
            System.out.println(super.getRollNumber()+" "+super.getName()+" "+super.getCourse()+" "+this.CGPA);
        }
    }
}//end of PGPhD class
