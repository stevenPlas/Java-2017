package pkg03_inputproblem;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;    //To hold user;s name
        int age;        //To hold the user's age
        double income;  //To hold the user's income.
        
        // Create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //get users age
        System.out.print("What is your age? ");
        age = keyboard.nextInt();
        
        //Get the users income
        System.out.print("What is your income? ");
        income = keyboard.nextDouble();
        
        //consume the remaining newline
        keyboard.nextLine();
        
        //Get the user's name
        System.out.print("What is your name? ");
        name = keyboard.nextLine();
        
        //display information to the user
        System.out.print("Hello, " + name + ". Your age is " + age + 
                         " and your income is " + income + "\n\n");
    }
    
}
