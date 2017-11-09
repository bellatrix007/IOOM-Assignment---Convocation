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
class EmptyFieldException extends Exception{
    
    EmptyFieldException(String s)
    {
        super(s);
    }
}

class InvalidCourseException extends Exception{
    
    InvalidCourseException(String s)
    {
        super(s);
    }
}