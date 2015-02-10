//Alyson Givre
//Homework 3
//Problem 3

/* This program prompts the user to enter a double 
and then prints the 4 digits after the decimal */

import java.util.Scanner; //import scanner

public class FourDigits {
    
    public static void main(String [] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner (System.in);
        
        //Prompt user to enter double
        System.out.print("Enter a double and I display the " +
            "four digits to the right of the decimal point: ");
            double number = scan.nextDouble();
        
        //find the first digit
        int digit1 = (int) (number * 10) % 10;
        //find the second digit
        int digit2 = (int) (number * 100) % 10;
        //find the third digit
        int digit3 = (int) (number * 1000) % 10;
        //find the fourth digit
        int digit4 = (int) (number * 10000) % 10;
        
        
        //print the four digits
        System.out.print("The four digits are " + digit1);
        System.out.print(digit2);
        System.out.print(digit3);
        System.out.print(digit4 + "\n");
        
    } //end main method
    
} //end class