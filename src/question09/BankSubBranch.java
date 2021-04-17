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
public class BankSubBranch implements Bank {

    @Override
    public boolean cashCounter() {
        return Bank.super.cashCounter();
    }

    @Override
    public String cashWithdrawal() {
        return "Can be withdrawan without any limits";
    }

    @Override
    public String cashDeposit() {
        return "Can deposit balance here upto 490000";
    }

    @Override
    public String toString() {
        return "Cash counter has no issues during working hours.";
    }

}
