
package pkg06_challenge_05;

/**
 * Java Chapter 2, programming challenge 05
 * 5/18/17
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double east = 0.62;
        final double yearTotal = 4600000;
        double eastTotal = yearTotal * east;
        
        System.out.println("The east coast devision made a total of: $" + 
                eastTotal + " this year.\n\n");
    }
    
}
