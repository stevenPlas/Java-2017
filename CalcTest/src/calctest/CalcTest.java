package calctest;
import java.util.*;
/**
 * Creating a normal calculator using java classes
 * @author Steven
 */
public class CalcTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare scanner variable
        Scanner input = new Scanner(System.in);
        
        int select = 0; // declaring select and setting it == 0
        boolean isNumber;
        int a, b; // declaring variables for two different numbers
               
        do {
        menu(); // calls menu function to display options
        print("\nPlease select an option: ");
         
        //If statement validates the user input
        if(input.hasNextInt()){
            select = input.nextInt(); // gets the user's select input    
            isNumber = true;
        }else{
            println(select + " is not a number.\n");
            isNumber = false;
            input.next();
        }
        
        //Switch case options calling different classes
        switch (select) {
            case 1:
                println("Enter in two numbers: ");
                print("Number 1: ");
                a = input.nextInt();
                print("Number 2: ");
                b = input.nextInt();
                System.out.println("\nOutput: " + Addition.Add(a, b) + "\n"); // calls and output's classes
                break;
            case 2:
                println("Enter in two numbers: ");
                print("Number 1: ");
                a = input.nextInt();
                print("Number 2: ");
                b = input.nextInt();
                System.out.println("\nOutput: " + Subtraction.Sub(a, b) + "\n"); // calls and output's classes
                break;
            case 3:
                println("Enter in two numbers: ");
                print("Number 1: ");
                a = input.nextInt();
                print("Number 2: ");
                b = input.nextInt();
                System.out.println("\nOutput: " + Multiplication.Multi(a, b) + "\n"); // calls and output's classes
                break;
            case 4:
                println("Enter in two numbers: ");
                print("Number 1: ");
                a = input.nextInt();
                print("Number 2: ");
                b = input.nextInt();
                System.out.println("\nOutput: " + Division.Divide(a, b) + "\n"); // calls and output's classes
                break;
            case 5:
                println("Byee!!!!");
                System.exit(0); // Shut's down the jvm
            default:
                println("Try another number");
                isNumber = false;
        }
      }while(!(isNumber));
        
        
        
        
        
    }
    
    
    public static void println(String str){
        System.out.println(str);
    }
    
    public static void print(String str){
        System.out.print(str);
    }
    
    public static void menu(){
        print(  "**********************************\n"+
                "\t1:Addition \n" +
                "\t2:Subtraction \n" +
                "\t3:Multiplication \n" +
                "\t4:Division \n" +
                "\t5:Exit \n" +
                "**********************************\n");
    }
    
    
}
