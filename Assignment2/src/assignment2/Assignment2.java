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
//import java.util.Scanner;

public class Assignment2
{
    ArrayList<student> s = new ArrayList<student>();
    
    public static void main(String args[])
    {
        //Scanner sc = new Scanner(System.in);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame2().setVisible(true);
            }
        });
        
        //int t = sc.nextInt();   //number of test cases
        
        //while(t-- > 0)
        //{ 
            //int number = sc.nextInt();  //number of students
            
            /*ArrayList<student> s = new ArrayList<student>();  //array of base class
            UG ug;
            PG pg;
            UGPG ugPg;
            PhD phD;
            PGPhD pgPhD;   
            
            //for(int i=0;i<number;i++)
            //{
                String course = sc.next();
                if(course.equals("UG"))
                {
                    ug = new UG(course, i, sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                    s[i] = ug;
                }
                else if(course.equals("PG"))
                {
                    pg = new PG(course, i, sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.next());
                    s[i] = pg;
                }
                else if(course.equals("UG+PG"))
                {
                    ugPg = new UGPG(course, i, sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.next(),sc.nextInt());
                    s[i] = ugPg;
                }
                else if(course.equals("PhD"))
                {
                    phD = new PhD(course, i, sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
                    s[i] = phD;
                }
                else if(course.equals("PG+PhD"))
                {
                    pgPhD = new PGPhD(course, i, sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.next(),sc.nextInt());
                    s[i] = pgPhD;
                }
            //}
            System.out.println(new student().getCount());   //to print the number of graduating students
            for(int i=0;i<number;i++)
            {
                s[i].display(); //print the graduating students list
            }
            
            new student().setCount();   //set count to zero for each test case*/
            
        //}
    }
    
    void addS(student s1)
    {
        s.add(s1);
    }
}//end of assignemnt class
