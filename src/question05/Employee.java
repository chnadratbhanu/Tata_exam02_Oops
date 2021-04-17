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
public class Employee extends Person{
    //employee has an office, salary, and date hired
    private String office;
    private int salary;
    private Date date;

    public Employee(String office, int salary, Date date, String name,
            String address, int phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.date = date;
    }
    
    @Override
    public String toString() {
        return "Person name is " + super.getName() +"and class name is "+ this.getClass().getName();
    }
    
    
}
