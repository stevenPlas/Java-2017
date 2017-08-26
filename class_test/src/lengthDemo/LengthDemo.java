/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthDemo;

/**
 *
 * @author Steven
 */
public class LengthDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Create a rectangle object and assign its address to
        the box variable.
        */
        Rectangle box = new Rectangle();
        
        //Indicate what we a re doing
        System.out.println("Sending the value 10.0" +
                    " to the setLength Method.");
        
        //call the box object's setLength method.
        box.setLength(10.0);
    }
    
}
