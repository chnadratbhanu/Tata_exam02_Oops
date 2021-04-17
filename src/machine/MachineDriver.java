/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class MachineDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        Machine mach1 = new CncMachine("CNC"); //polymorphic substitution
        System.out.println(mach1); //late binding polymorphism
//        mach1.stop();
    }
    // TODO code application logic here
}
