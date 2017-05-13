/*
 * Steven Plas
 * Programming Challeng 1
 * Chapter 2
 * 5/13/17
 */
package pkg04_challenge01;
import java.util.Scanner;
/**
 * This program stores your name, age and annual pay
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;    //Holds user's name
        int age;        //Holds user's age
        double income;  //Holds user's income
        
        Scanner input = new Scanner(System.in);
        
        print("What's your name? ");
        name = input.nextLine();
        
        print("How old are you? ");
        age = input.nextInt();
        
        print("How much do you make annually? ");
        income = input.nextDouble();
        
        print("\nHello " + name + ", you are " + age + " years old, " +
                "and you make a total of $" + income + " anually\n\n");
        
    }
    
    public static void print(String name){
        System.out.print(name);
    }
    
}
