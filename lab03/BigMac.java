//Alyson Givre
//Lab 3
//February 6, 2015

/* This program takes input from the user and calculates the cost and
tax on Big Macs */

import java.util.Scanner; //import scanner

public class BigMac {
    
    public static void main(String[] args) {
        
        //declare and construct scanner
        Scanner myScanner = new Scanner(System.in); 
        
        //prompt user to enter # of Big Macs
        System.out.print("Enter the number of Big Macs(an integer" +
            " > 0): ");
            int nBigMacs = myScanner.nextInt();
        
        //prompt user to enter price    
        System.out.print("Enter the cost per Big Mac as" +
            " a double (in the form xx.xx): ");
                double bigMac$ = myScanner.nextDouble();
        
        //prompt user to enter the tax percentage
        System.out.print("Enter the percent tax as a whole " +
            "number (xx): ");
            double taxRate = myScanner.nextDouble();
        taxRate/=100; //change tax rate to proportion
        
        //calculate price
        double cost$ = nBigMacs * bigMac$ * (1 + taxRate);
        int dollars = (int) cost$; //find # of dollars
        int dimes = (int) (cost$ * 10) % 10;
        int pennies = (int) (cost$ * 100) % 10;
        
        //print results
        System.out.println("The total cost of " + nBigMacs +
            " BigMacs, at $" + bigMac$ + " per BigMac, with a " +
            "sales tax of " + (int)(taxRate * 100) + "%, is $" +
            + dollars + "." + dimes + pennies);
        
    } //end main method
    
} //end class