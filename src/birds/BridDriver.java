/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class BridDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        // TODO code application logic here
//        Dog d=new Dog();
//d.bark();
//d.eat();
//}
        Bird b = new Crow();
        System.out.println(b);
        b.fly();
    }

}
