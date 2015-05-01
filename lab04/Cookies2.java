//Alyson Givre
//Lab 4

/* This program takes input from the user to determine if they have bought
enough cookies */

import java.util.Scanner; //import scanner

public class Cookies2 {
    //main method
    public static void main(String[] args) {
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //tell user to enter the number of people
        System.out.print("Enter the number of people: ");
        boolean people = scan.hasnextInt();
        //if input is invalid
        if(people == false) {
            //tell user input was invalid
            System.out.println("You did not enter an int");
            //end program
            return;
        }
        int nPeople = scan.nextInt();
        //check if input is positive
        if(nPeople < 0) {
            //tell user input is invalid
            System.out.println("You did not enter an int > 0");
            //end program
            return;
        }
        
        //tell user to enter number of cookies
        System.out.println("Enter the number of cookies you are planning to buy: ");
        boolean cookies = scan.hasnextInt();
        //if input is invalid
        if(cookies == false) {
            //tell user input was invalid
            System.out.println("You did not enter an int");
            //end program
            return;
        }
        int nCookies = scan.nextInt();
        //check if input is positive
        if(nCookies < 0) {
            //tell user input is invalid
            System.out.println("You did not enter an int > 0");
            //end program
            return;
        }
        
        //tell user to enter number each
        System.out.println("How many do you want each person to get? ");
        boolean each = scan.hasnextInt();
        //if input is invalid
        if(each == false) {
            //tell user input was invalid
            System.out.println("You did not enter an int");
            //end program
            return;
        }
        int nEach = scan.nextInt();
        //check if input is positive
        if(nEach < 0) {
            //tell user input is invalid
            System.out.println("You did not enter an int > 0");
            //end program
            return;
        }
        
        //divide evenly case
        if( (nPeople * nEach) == nCookies | nEach == 0) {
            //print statement
            System.out.println("You will have enough cookies for each person" +
                " and the amount will divide evenly.");
        }
        
        //not enough case
        if( (nPeople * nEach) < nCookies) {
            int nMore = nCookies - (nPeople * nEach);
            //print statement
            System.out.println("You will not have enough cookies. You will" +
            " need to buy at least " + nMore + " more.");
        }
        
        //divide unevenly case
        if( (nPeople * nEach) > nCookies & (nPeople * nEach) % nCookies != 0) {
            //print statement
            System.out.println("You have enough, but they will not divide evenly.");
        }
        
        
    } //end main method
    
} //end class