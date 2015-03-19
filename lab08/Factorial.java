//Alyson Givre
//Lab 8

//This program finds the super factorial of a number inptted by the user

import java.util.Scanner; //import scanner

public class Factorial {
    //main method
    public static void main(String[] args) {
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //initialize n
        int n;
        
        //ask user to enter an integer
        System.out.print("Enter a postive int: ");
        //check if input is valid
        while(!scan.hasNextInt()) {
            //tell user to enter another value
            System.out.print("Invalid input. Enter a positive int: ");
            //scan for next input
            scan.next();
        }
        //save n value
        n = scan.nextInt();
        //check if n is positive
        while(n < 0) {
            //tell user to enter again
            if (n < 0) {
                //print that input is invalid
                System.out.print("Invalid input. Enter a postive int: ");
            }
            //check if input is an int
            while(!scan.hasNextInt()) {
                //tell user to enter another value
                System.out.print("Invalid input. Enter a positive int: ");
                //scan for next input
                scan.next();
            }
            //save n value
            n = scan.nextInt();
        }
        
        //call factorial method with n as the input
        int fact = factorial(n);
        //call print method with n and fact as input
        print(n, fact);
    }//end main method
    
    //factorial method
    public static int factorial(int input) {
        //initialize variables
        int factorial = 1;
        int total = 0;
        //calculate factorial
        for(int i = input; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                //factorial equals itself times j
                factorial *= j;
            }
            //add factorials together
            total += factorial;
            //reset factorial value
            factorial = 1;
        }
        //return statement
        return total;
    } //end factorial method
    
    //print method
    public static void print(int input, int sum) {
        //print result
        System.out.println("The super factorial of " + input + " is " +
            sum);
    } //end print method
    
} //end class