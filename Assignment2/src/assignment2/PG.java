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
class PG extends student    //derived class
{
    private String specialization, thesisArea, dept;
    private int CGPA;
    
    PG(String course, String roll, String name, String dept, String specialization, int regPeriod, int CGPA, int credits, String thesisArea) //constructor
    {
        super(course, roll, name, regPeriod, credits);   //call to base class constructor
        this.dept = dept;
        this.CGPA = CGPA;
        this.specialization = specialization;
        this.thesisArea = thesisArea;
        setGradStatus(regPeriod, credits);
    }
    
    void setGradStatus(int regPeriod, int credits)  //to set if the student is graduating
    {
        if((regPeriod>=2&&regPeriod<=8)&&credits>=80)
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
}//end of PG class
