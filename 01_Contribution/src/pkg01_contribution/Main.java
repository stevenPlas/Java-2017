/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_contribution;

/**
 * //Code listing 2-8 Chap 2, Java Fundamentals
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables to hold the monthly pay and the amount of contribution
        double monthlyPay = 6000.0;
        double contribution;
        
        //calculate and display a 5% contribution.
        contribution = monthlyPay * 0.05;
        System.out.println("5 percent is $" + contribution + " per month");
        
        //calculate and display a 8% contribution.
        contribution = monthlyPay * 0.08;
        System.out.println("8 percent is $" + contribution + " per month");
        
        //calculate and display a 10% contribution.
        contribution = monthlyPay * 0.1;
        System.out.println("10 percent is $" + contribution + " per month");
    }
    
}
