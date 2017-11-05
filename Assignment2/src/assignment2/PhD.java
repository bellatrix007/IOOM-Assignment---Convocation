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
class PhD extends student   //derived class
{
    private String thesisArea;
    
    PhD(String course, String roll, String name, int regPeriod, int credits, String thesisArea)  //constructor
    {
        super(course, roll, name, regPeriod, credits);   //call to base class constructor
        this.thesisArea = thesisArea;
        setGradStatus(regPeriod, credits);
    }
    
    void setThesis(String s)
    {
        this.thesisArea = s;
    }
    
    void setGradStatus(int regPeriod, int credits)  //to set the graduating status of student
    {
        if((regPeriod>=2&&regPeriod<=6)&&credits>=64)
            super.setGradStatus();
    }
    
    @Override
    void display()
    {
        if(super.getGradStatus() == 1)
        {
            System.out.println(super.getRollNumber()+" "+super.getName()+" "+super.getCourse());
        }
    }
}//end of PhD class
