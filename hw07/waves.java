//Alyson Givre
//Homework 7

/* This program asks the user to enter a number between 1 and 30 and then prints
a wave pattern up to that number */

import java.util.Scanner; //import scanner

public class waves {
    
    public static void main(String[] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //initialize number value
        int number = -1;
        
        //ask user to enter number
        System.out.print("Enter a number between 1 and 30: ");
        //check if number is in the right range
        while(number < 1 | number > 30) {
            while(!scan.hasNextInt()) {
                //print that input is invalid
                System.out.print("Invalid input. Enter again: ");
                //scan for next input
                scan.next();
            }
            System.out.print("Invalid input. Enter again: ");
            //initialize number value
            number = scan.nextInt();
        }
        System.out.println(number);
        
            
        
    } //end main method
    
} //end class