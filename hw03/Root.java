//Alyson Givre
//Homework 3
//Problem 2

import java.util.Scanner; //import scanner

public class Root {
    
    public static void main (String[] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner (System.in); 
        
        //Prompt user to enter a double
        System.out.print("Enter a double, and I print its " +
            "cube root: ");
            double number = scan.nextDouble();
        
        //make a guess    
        double guess = number / 3;
        //improve guess first time
        guess = (2 * guess * guess * guess + number) / 
            (3 * guess * guess);
        //improve guess second time
        guess = (2* guess * guess * guess + number) / 
            (3 * guess * guess);
        //improve guess third time
        guess = (2* guess * guess * guess + number) / 
            (3 * guess * guess);
        //improve guess fourth time
        guess = (2 * guess * guess * guess + number) / 
            (3 * guess * guess);
        //improve guess fifth time
        guess = (2 * guess * guess * guess + number) / 
            (3 * guess * guess);
            
        //print guess
        System.out.println("The cube root is " + guess);
        System.out.println(guess + " * " + guess + " * " + guess +
            " = " + (guess * guess * guess));
        
    } //end main method
    
} //end class