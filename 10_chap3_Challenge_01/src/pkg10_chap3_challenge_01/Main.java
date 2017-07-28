package pkg10_chap3_challenge_01;
import java.util.Scanner;
/**
 * 7-28-17
 * Chap 3 Roman Numerals chall 01
 * "Write a program that prompts user to enter a number between 1-10
 * Display the number as a Roman Numeral
 * Display error if > 10
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner variable for keyboard input
        Scanner input = new Scanner(System.in);
        
        System.out.print ("Enter a number between 1 and 10: ");
        int num = input.nextInt();
        
        if(num < 1 || num > 10){
            System.out.println(num + " Is not a number betweet 1 and 10");
        } else{
            switch(num){
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IV");
                    break;
                case 10:
                    System.out.println("X");
                    break;
                
            }
        }
        
        
        
    }
    
}
