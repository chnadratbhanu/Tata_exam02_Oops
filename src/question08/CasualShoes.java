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
public class CasualShoes extends Shoes {

    public CasualShoes(String color, boolean forRunning) {
        super(color, forRunning);
    }

    @Override
    public void running() {
        System.out.println(super.getcolor()+" Casual Shoes are not comfortable for running.");
    }

}
