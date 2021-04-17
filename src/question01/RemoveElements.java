/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class RemoveElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> userArray = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        System.out.print("Enter ten integers:- ");
        for (int i = 0; i < 10; i++) {
            userArray.add(scan.nextInt());
        }
        removeElements(userArray); //removeElements = removing duplicate
        //elements
    }

    public static void removeElements(ArrayList<Integer> list) {
        ArrayList<Integer> finalArray = new ArrayList<>();
        for (Integer nmbr : list) {
            if (!(finalArray.contains(nmbr))) {
                finalArray.add(nmbr);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer distinct : finalArray) {
            System.out.print(distinct + " ");
        }
        System.out.println();
    }
}
