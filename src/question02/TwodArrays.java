/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.Scanner;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class TwodArrays {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int[][] arrayOne = new int[3][3];
        int[][] arrayTwo = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayOne[i][j] = scan.nextInt();
            }
        }
        
        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayTwo[i][j] = scan.nextInt();
            }
        }

        boolean equalsOrNot = equals(arrayOne, arrayTwo);
        if (equalsOrNot) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int noChecker = 0;
        if (m1.length == m2.length) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2.length; j++) {
                    if (!(m1[i][j] == m2[i][j])) {
                        noChecker = 1;
                    }
                }
            }
        }
        return noChecker == 0;

    }

}
