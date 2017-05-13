/*
 * This program calculates the sale price of an
 * Item that is reguarly priced at $59, with
 * A 20 percent discount subtracted.
 */
package pkg02_discount;

/**
 *Code listing 2-19 Java, Chap 2
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables to hold the regular price, the amount of a discount, and the sale price.
        double regularPrice = 59.0;
        double discount;
        double salePrice;
        
        // Calculate the amount of a 20% discount
        discount = regularPrice * 0.2;
        
        // Calculate the sale price by subtracting the discount from the regular price.
        salePrice = regularPrice - discount;
        
        // Display the results.
        System.out.println("Regular Price: $" + regularPrice);
        System.out.println("Discount amount: $" + discount);
        System.out.println("Sale Price: $" + salePrice);
    }
    
}
