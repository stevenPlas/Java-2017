/*
 * Steven Plas
 * Java Programming Challenge 03
 * Chapter 2
 * 5/13/17
 */
package pkg05_challenge03;
import java.util.Scanner;

/**
 * Create a program that displays your name, address, with city, state, and zip
 * also with your telephone number and college major
 * @author Steven
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare scanner input variable
        Scanner input = new Scanner(System.in);
        
        //Prompt for, and declare name variable
        print("What is your name? ");
        String name = input.nextLine();
        
        //Prompt for, and declare Address variable
        print("What is your address? ");
        String address = input.nextLine();
        
        //Prompt for, and declare city variable
        print("Which city do you live in? ");
        String city = input.nextLine();
        
        //Prompt for, and declare state variable
        print("Which state do you live in? ");
        String state = input.nextLine();    
        
        //Prompt for, and declare zip variable
        print("What's your zip code? ");
        int zip = input.nextInt();
        
        input.nextLine(); // clearing the buffer
        
        //Prompt for, and declare phone variable
        print("What's your phone number? ");
        String phoneNum = input.nextLine();
        
        //Prompt for, and declare major variable
        print("What's your college major? ");
        String major = input.nextLine();
         
        //Display output for user
        print("\n\n*************************************" + "\n" +
              "*\tName: " + name + "\n" +
              "*\tAddress: " + address + "\n" +
              "*\tCity: " + city + "\n" +
              "*\tState: " + state + "\n" +
              "*\tZip: " + zip + "\n" +
              "*\tPhone Number: " + phoneNum + "\n" +
              "*\tMajor: " + major + "\n" +
              "*************************************\n\n" );
        
        
        
    }
    
    //Printing class, for lazieness
    public static void print(String print){
        System.out.print(print);
    }
    
}
