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
        int a, b; // declaring variables for two different numbers
               
        while(select != 5){
        menu(); // calls menu function to display options
        print("\nPlease select an option: ");
         
        try{
        select = input.nextInt(); // gets the user's select input
        }catch(Exception e){
            System.out.print(e + " Is not a number between 1 & 5\n\n");
            break;
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
                break;
        }
      }
        
        
        
        
        
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
