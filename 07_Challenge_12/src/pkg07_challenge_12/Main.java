/**
 * Write a program that asks the user to enter the name of their favorite city
 * Use a string var to store input
 * the program should display the following:
 * Number of Characters
 * Name of string in all upper
 * name of the string in all lower
 * first character
 * reversed
 */
package pkg07_challenge_12;
import java.util.Scanner;

/**
 * Java, Chapter 2, Programming challenge 13
 * 5/18/17
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare scanner input
        Scanner input = new Scanner(System.in);
        
        //Get user input
        printS("Please input a string: ");
        String text = input.nextLine();
        
        //change type of input to int
        int length = text.length();
        
        //reverse string
        String reverse = new StringBuffer(text).reverse().toString();
        
        //Print the length of the string
        printS("Length of string: ");
        System.out.println(length); // not using method as it will not print int's
        
        //Print out input in all uppercase
        printS("\n String to upper case: " + text.toUpperCase());
        
        //Print out input in lowercase
        printS("\n String to Loser case: " + text.toLowerCase());
        
        //Print out the first character of the string
        printS("\n First character of string: " + text.charAt(0));
        
        //Print the reversed string
        printS("Reverse: " + reverse + "\n\n");
        
    }
    
    //Print method for shorthand printing
    public static void printS(String str){
        System.out.print(str);
    }
    
}
