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
public class Faculty extends Employee {

    //office hours and number of teaching subjects
    private int officehours;
    private int NoOfTeachingHours;

    public Faculty(int officehours, int NoOfTeachingHours, String office,
            int salary, Date date, String name, String address, int phoneNumber,
            String emailAddress) {
        super(office, salary, date, name, address, phoneNumber, emailAddress);
        this.officehours = officehours;
        this.NoOfTeachingHours = NoOfTeachingHours;
    }

    @Override
    public String toString() {
        return "Person name is " + super.getName() + "and class name is " +
                this.getClass().getName();
    }

}
