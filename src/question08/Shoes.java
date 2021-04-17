/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

/**
 *
 * @author Chandra Bhanu Tata
 */
public abstract class Shoes {

    private String color;
    private boolean forRunning;

    public Shoes(String color, boolean forRunning) {
        this.color = color;
        this.forRunning = forRunning;
    }

    public abstract void running();

    public String getcolor() {
        return color;

    }
}
