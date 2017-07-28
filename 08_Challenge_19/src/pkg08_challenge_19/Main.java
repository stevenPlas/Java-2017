package pkg08_challenge_19;

/**
 *Joe Purchased 1000 shares at 32.87 per share
 * joe payed his stock broker 2% of the total cost
 * joe sold those shares for 33.92
 * he paid his stock broker another 2%
 * Display the following:
 * amount of money joe payed for the stock
 * the amount of commission joe payed his broker
 * the amount joe sold his stock for
 * the amount joe of commission joe payed his broker again
 * display the profit that joe made in total after selling the stock, and paying his broker.
 * @author Steven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int shares = 1000;
        final double broker = 0.02;
        double amountPayed = shares * 32.87;
        double brokerShare1 = amountPayed * broker;
        double amountSold = shares * 33.92;
        double brokerShare2 = amountSold * 0.02;
        
        
        
        
    }
    
}
