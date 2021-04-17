/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question082;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Movie extends MovieTicket {
    @Override
    String ticketPrice() {
        return "Movie charges and Goverment tax.";
    }

    @Override
    String Snacks() {
       return "Popcorn,Sweetcorn And Samosa.";
    }
    
    public String Parking(){
        return "Two Wheelers, three Wheelers and four wheelers. ";
    }

    @Override
    public String toString() {
        return "Movie marketing is diffucult than other.";
    }

    
    
}
