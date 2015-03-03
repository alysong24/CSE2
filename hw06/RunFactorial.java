//Alyson Givre
//Homework 6
//Program 2

/* This program asks the user for a number between 9 and 16 and solves 
factorial problems */

import java.util.Scanner; //import scanner

public class RunFactorial {
    
    public static void main(String[] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //initialize factorial
        long factorial = 1;
        
        //ask user to enter an integer between 9 and 16
        System.out.println("Please enter a number that is between 9 and 16: ");
        
        //have user enter values until value is an integer
        while(!scan.hasNextInt()) {
            //tell user to enter another number
            System.out.println("Invalid input, enter again!");
            //scan for next input
            scan.next();
        }
        //save value of number
        int number = scan.nextInt();
        
        //check if number is between 9 and 16
        while (number < 9 | number > 16) {
            //tell user input is invalid
            System.out.println("Invalid input, enter again!");
            //have user enter values until value is an integer
            while(!scan.hasNextInt()) {
                //tell user to enter another number
                System.out.println("Invalid input, enter again!");
                //scan for next input
                scan.next();
            }
            //save value
            number = scan.nextInt();
        }
        //print that input was accepted
        System.out.println("Input accepted: ");
        System.out.print(number + "! = ");
        //calculate factorial
        while(number > 0) {
            //factorial equals itself times the number
            factorial = factorial * number;
            //make number go down by one
            number--;
        }
        //print result
        System.out.print(factorial + "\n");
     
    } //end main method
    
} //end class
