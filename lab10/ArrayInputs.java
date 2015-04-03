//Alyson Givre
//Lab 10

/* This lab asks the user to enter the size of an array and then asks the user 
to fill the array with integers*/

import java.util.Scanner; //import scanner

public class ArrayInputs {
    //main method
    public static void main(String [] args) {
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //declare array
        int [] inputs;
        //initialize counter variable
        int counter = 0;
        int i;
        
        //ask user to enter size of array
        System.out.print("Please enter an integer for the size of an array: ");
        //save size
        int size = scan.nextInt();
        size = isPositive(scan, size);
        //allocate array
        inputs = new int [size];
        //ask user to fill array
        System.out.print("Please enter " + size + " positive integers: ");
        //scan for input
        scan.nextLine();
        while(counter < size) {
            //check if input is an integer
            while(!scan.hasNextInt()) {
                //tell user they didn't enter an integer
                System.out.println("Sorry you didn't enter an integer.");
                //tell user to enter integer
                System.out.print("Please enter a positive integer: ");
                scan.nextLine();
            }
            //save i value
            i = scan.nextInt();
            //check if i is positive
            i = isPositive(scan, i);
            //save i to array
            inputs[counter] = i;
            //increase counter
            counter++;
            
        }
        //print statement 
        System.out.println("The array is: ");
        for(int j = 0; j < size; j++) {
            //print out array
            System.out.println(inputs[j]);
        }
    }//end main method
    
    //isPositive method
    public static int isPositive(Scanner scan, int n){
        if (n >= 0) {
            return n;
        }
        else {
            //print statement 
            System.out.println("Sorry, the number you entered is negative.");
            //tell user to enter again
            System.out.print("Please enter a positive integer: ");
            //scan for input
            scan.nextLine();
            //check if input is an integer
            while(!scan.hasNextInt()) {
                //tell user they didn't enter an integer
                System.out.println("Sorry you didn't enter an integer.");
                //tell user to enter integer
                System.out.print("Please enter a positive integer: ");
                scan.nextLine();
            }
            //save n value
            n = scan.nextInt();
            //check if n is positive
            n = isPositive(scan, n);
            return n;
        }
    } //end isPositive method
    
    
} //end class