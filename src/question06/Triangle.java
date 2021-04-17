/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Triangle extends GeometricObject {

    //Write a test program that prompts the user to enter three sides of the 
    //triangle, a color, and a Boolean value to indicate whether the triangle is filled
    private double sideA;
    private double sideB;
    private double sideC;
    private String color;
    private boolean filled;

    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
        this.filled = filled;
    }

    @Override
    double perimeter() {
        return this.sideA + this.sideB + this.sideC;

    }

    @Override
    double area() {
        double peravg = this.perimeter() / 2;
        return Math.sqrt(Math.abs(peravg * (peravg - sideA) * (peravg - sideB) * (peravg - sideC)));
    }

    @Override
    public String toString() {
        return "Triangle properties: \nArea is "
                + Math.round(this.area() * 100) / 100.0
                + "\nPerimeter is " + this.perimeter()
                + "\nThe Triangle is "
                + (filled ? "Filled" : "Not Filled ")
                + "\nTriangle Color is " + color;
    }
}
