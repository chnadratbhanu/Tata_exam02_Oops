/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class LoancircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        // TODO code application logic here
        ArrayList<Object> arrayOfObjects = new ArrayList<>();

        Loan loanObj = new Loan("jaya", 250000, 5);
        Circle circleObj = new Circle(77, false, true);
        String stringObj = "Bhanu";
        Date dateObj = new Date();

        arrayOfObjects.add(loanObj);
        arrayOfObjects.add(circleObj);
        arrayOfObjects.add(stringObj);
        arrayOfObjects.add(dateObj);

        for (Object loancir : arrayOfObjects) {
            System.out.println(loancir);
        }
    }

}
