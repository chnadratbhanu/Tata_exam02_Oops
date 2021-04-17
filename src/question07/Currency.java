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
public enum Currency {
    TEN(1), TWENTY(2), FIFTY(5), HUNDREED(10);
    private final int rupeeNotes;

    Currency(int rupeeNotes) {
        this.rupeeNotes = rupeeNotes;
    }

    int togetRupeeNotes() {
        return rupeeNotes;
    }

    int toDenomination(int numTens) {
        return numTens / rupeeNotes;
    }
}
