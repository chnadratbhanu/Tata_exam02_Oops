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
public class SupplierShop implements Supplier {

    private double monthlyIncome;

    public SupplierShop(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public double monthlyRevenue() {
        return this.monthlyIncome * (0.8);
    }

    @Override
    public String toString() {
        return "Supplier Shop \n"
                + "The monthly Total income is " + monthlyIncome + "\n"
                + "The Monthly  Total revenue is " + monthlyRevenue();
    }

    @Override
    public double calculateProducts() {
        throw new UnsupportedOperationException("Not supported yet.");
//To change body of generated methods, choose Tools | Templates.
    }

    

}
