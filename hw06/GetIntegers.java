//Alyson Givre
//Homework 6
//Program 1

/* This program asks the user to enter integers and then prints the sum of the 
five integers */

import java.util.Scanner; //import scanner

public class GetIntegers {
    
    public static void main(String[] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        
        //initialize sum value, int, and boolean values 
        int sum = 0;
        int number;
        boolean test;
        boolean test2 = true;
        
        //ask user to enter 5 integers
        System.out.println("Please enter 5 non-negative integers: ");
            for (int i = 1; i <= 5; i++) {
                //check if input is an integer
                if (!scan.hasNextInt()) {
                    //print that input was invalid
                    System.out.println("Invalid input, enter again");
                    //scan for new value
                    scan.next();
                    //decreade i by one
                    i--;
                }
                else {
                    //save number value
                    number = scan.nextInt();
                    //check if positive
                    if (number >= 0) {
                        sum = sum + number;
                    }
                    //if not positive
                    else {
                        //print that input is invalid
                        System.out.println("Invalid input, enter again");
                        //decrease i by one
                        i--;
                    }
                }
            }
            
        //print sum    
        System.out.println("Sum is " + sum);
        
    } //end main method
    
} //end class