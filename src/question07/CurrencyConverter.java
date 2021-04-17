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
public enum CurrencyConverter {
    DollarToRupee("Dollar to Rupee") {
        @Override
        double convert(double value) {
            return value * 74.54;
        }
    },
    DollarToYen("Dollar to Yen") {
        @Override
        double convert(double value) {
            return value * 108.82;
        }
    };

    CurrencyConverter(String rupyen) {
        this.rupyen = rupyen;
    }

    private String rupyen;

    @Override
    public String toString() {
        return rupyen;
    }

    abstract double convert(double value);

}
