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
public class ConverterDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        // TODO code application logic here
        System.out.println(CurrencyConverter.DollarToRupee + " = "
                + CurrencyConverter.DollarToRupee.convert(1) + "₹");
        System.out.println(CurrencyConverter.DollarToYen + " = "
                + CurrencyConverter.DollarToYen.convert(1) + "¥");
    }

}
