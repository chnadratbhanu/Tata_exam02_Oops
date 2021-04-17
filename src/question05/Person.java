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
public class Person {
    //A person has a name, address, phone number, and email address
    private String name;
    private String address;
    private int phoneNumber;
    private String emailAddress;

    public Person(String name, String address, int phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Person name is " + name +"and class name is "+ this.getClass().getName();
    }
    
    
    
    
}
