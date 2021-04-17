/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Student extends Person  {
    //grade and class status(Graduate).
    // status as constant
    private double grade; 
    public static final String CLASS_STATUS = "GRADUATE";

    public Student(double grade, String name, String address, int phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Person name is " + super.getName() +"and class name is "+ this.getClass().getName();
    }
    
}
