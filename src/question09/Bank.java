/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Chandra Bhanu Tata
 */
public interface Bank {

    default boolean cashCounter() {
        return true;
    }

    String cashWithdrawal();

    String cashDeposit();

}
