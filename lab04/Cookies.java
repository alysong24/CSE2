//Alyson Givre
//Lab 4
//February 13, 2015

/* This program tells the user how many cookies they should buy for
an event*/

import java.util.Scanner; //import scanner

public class Cookies {
    
    public static void main(String[] args) {
        
        //construct and declare scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user to enter # of people
        System.out.print("Enter the number of people: ");
        
        //if user enters an integer...
        if (myScanner.hasNextInt()) {
            //saves number of people
            int nPeople = myScanner.nextInt();
            
            //check if number is greater than 0
            if (nPeople > 0) {
                //ask for number of cookies
                System.out.print("Enter the number of cookies you" +
                " are planning to buy: ");
                //save number of cookies bought
                int nCookies = myScanner.nextInt();
                
                //check if number is greater than 0
                if (nCookies > 0) {
                    System.out.print("How many do you want each" +
                    " person to get? ");
                    int nEach = myScanner.nextInt();
                    
                    //check if even number for everyone
                    //if even amount for everyone
                    if ( ( nCookies - (nEach * nPeople) ) == nEach ) {
                        //print that there's enough
                        System.out.println("You have enough cookies" +
                        " for each person and the amount will divide" +
                        " evenly.");
                    }
                    
                    //if not even amount for everyone
                    else if ( ( nCookies - (nEach * nPeople) ) != nEach) {
                        //print that amount will not divide evenly
                        System.out.println("You will have enough, but" +
                        " they will not divide evenly.");
                    }

                    else {
                        //print that there will be not be enough and how
                        //many more are needed
                        int nMore = (nEach * nPeople) - nCookies;
                        System.out.println("You will not have enough " +
                        "cookies. You need to buy at least " + nMore +
                        " more.");
                    }
                    
                }
                
                //number is not greater than 0
                else {
                    System.out.println("You did not enter an int"
                     +" > 0");
                     return; //terminate program
                }
                
            }
            
            //number is not greater than 0
            else {
                System.out.println("You did not enter an int > 0");
                return; //terminate program
            }
            
        }
        
        else {
            //print that user did not enter an int
            System.out.println("You did not enter an int.");
            return; //terminate program
        }
        
    } //end main method
    
} //end class