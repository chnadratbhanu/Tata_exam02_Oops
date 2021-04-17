/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

import java.util.Date;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Staff extends Employee {

    //A staff member has a title. Override the toString method in each class 
    //to display the class name and the person’s name
    private String tittle;

    public Staff(String tittle, String office, int salary, Date date, String name,
            String address, int phoneNumber, String emailAddress) {
        super(office, salary, date, name, address, phoneNumber, emailAddress);
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Person name is " + super.getName() + "and class name is "
                + this.getClass().getName();
    }
}
