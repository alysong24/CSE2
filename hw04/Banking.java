//Alyson Givre
//Homework 4
//Problem 2

/* This program allows users to process banking transactions */

import java.util.Scanner; //import scanner

public class Banking {
    
    public static void main(String [] args) {
        
        //construct and declare scanner
        Scanner scan = new Scanner(System.in);
        
        //find initial amount of money 
        float initial = (float) (Math.random() * 10000);
        //make sure amount is between 1000 and 5000
        //if amount is below 1000
        if (initial < 1000) {
            //add 1000 to initial value
            initial = initial + 1000;
        }
        //if amount is above 5000
        else if (initial > 5000) {
            initial = (initial - 6000) + 1000;
        }
        
        //print instructions for user
        System.out.printf("You have $%.2f in your bank account.\n", initial);
        System.out.print("To deposit, money enter 1.\nTo withdraw money, " +
        "enter 2. \nTo view your balance, enter 3.\nWhat would you like to do? ");
            int decision = scan.nextInt();
            
        switch (decision) {
            case 1 : {
                System.out.print("How much would you like to deposit? " );
                    float deposit = scan.nextFloat();
                //check if deposit is positive
                if (deposit > 0) {
                    //calculate new balance
                    float total = initial + deposit;
                    //print new balance
                    System.out.printf("Your new balance is $%.2f.\n" , total);
                    break;
                }
                //if dposit is not positive
                else {
                    //print that value was not positive
                    System.out.println("You did not enter a positive value.");
                    break;
                }
            } //end of case 1
            
            case 2 : {
                System.out.print("How much would you like to withdraw? ");
                    float withdraw = scan.nextFloat();
                //check if amount is positive and less than initial balance
                if (withdraw > 0 && withdraw <= initial) {
                    //calculate new balance
                    float total = initial - withdraw;
                    //print new balance
                    System.out.printf("Your new balance is $%.2f.\n" , total);
                    break;
                }
                //if amount is positive but amount is greater than initial amount
                else if (withdraw > 0 && withdraw > initial) {
                    //tell user they do not have that much money
                    System.out.println("You do not have enough money in your" +
                    " account to withdraw that amount.");
                    break;
                }
                //if amount is not positive
                else {
                    //print that the value was not positive
                    System.out.println("You did not enter a positive value.");
                    break;
                }
            }
            
            case 3 : {
                //print balance
                System.out.printf("Your current balance is $%.2f.\n" , initial);
                break;
            }
            
            default : {
                //print that input was invalid
                System.out.println("Invalid input.");
            }
            
        }
    
        
    } //end main method
    
} //end class