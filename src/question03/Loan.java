/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Loan {
    private String loanName;
    private double loanAmount;
    private int repaymentPeriod;

    public Loan(String loanName, double loanAmount, int repaymentPeriod) {
        this.loanName = loanName;
        this.loanAmount = loanAmount;
        this.repaymentPeriod = repaymentPeriod;
    }

    @Override
    public String toString() {
        return "Loan Name is " + loanName + " and Amount of  " + loanAmount
                + " is sanctioned for a repaymentPeriod of  "
                + repaymentPeriod + "Years.";
    }

    
}
