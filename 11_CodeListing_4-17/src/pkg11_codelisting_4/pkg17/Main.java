package pkg11_codelisting_4.pkg17;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String filename;    //File name
        String friendName;  //Friend Name
            // Number of friends
        
        //Create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Get the number of friends
        System.out.print("How many freinds do you have? ");
        int numFriends = keyboard.nextInt();
        
        //Consume the remaining new line char
        keyboard.nextLine();
        
        //Get filename
        System.out.print("Enter the File Name: ");
        filename = keyboard.nextLine();
        
        //open the file
        PrintWriter outputFile = new PrintWriter(filename);
        
        //Get data and write it to file
        for(int i = 1; i <= numFriends; i++){
            //Get name of friend
            System.out.print("Enter the name of a friend number " + i + ": ");
            friendName = keyboard.nextLine();
            
            //Write name to the file
            outputFile.println(friendName);
        }
        
        //Close the file
        outputFile.close();
        System.out.println("Data written to the file.");
    }
    
    
}
