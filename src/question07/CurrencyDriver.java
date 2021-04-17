/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class CurrencyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        // TODO code application logic here

        System.out.println("The ten rupee note required for "
                + Currency.TEN + " is " + Currency.TEN.togetRupeeNotes());
        System.out.println("The ten rupee notes required for "
                + Currency.TWENTY + " is " + Currency.TWENTY.togetRupeeNotes());
        System.out.println("The ten rupee notes required for "
                + Currency.FIFTY + " is " + Currency.FIFTY.togetRupeeNotes());
        System.out.println("The ten rupee notes required for "
                + Currency.HUNDREED + " is " + Currency.HUNDREED.togetRupeeNotes());

    }

}
