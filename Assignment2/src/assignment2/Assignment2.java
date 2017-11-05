/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;

/**
 *
 * @author Aditi
 */


public class Assignment2
{
    private ArrayList<student> s = new ArrayList<student>();
    
    public void main(String args[])
    {
        
        Assignment2 obj = this;
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame2(obj).setVisible(true);
            }
        });
        
    }
    
    ArrayList<student> getStudents()
    {
        return s;
    }
}//end of assignemnt class
