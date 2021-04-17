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
public class ShoesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        // TODO code application logic here
        CasualShoes CasualShoes = new CasualShoes("Black",false);
        CasualShoes.running();
        // mango is seasonal 
        Shoes SportsShoes = new SportsShoes("red ",true);
        SportsShoes.running();
        // banana is not seasonal
      
        
    }

    }
    

