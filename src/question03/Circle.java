/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Circle {
    private double diameter;
    private boolean circumference;
    private boolean inCircle;

    public Circle(double diameter, boolean circumference,boolean inCircle) {
        this.diameter = diameter;
        this.circumference = circumference;
        this.inCircle = inCircle;
    }

    @Override
    public String toString() {
        return "Circle has "+ diameter+ " and is it circumference  "+ 
                circumference  + " and Is it inCircle "+ inCircle;
    }

    
}
