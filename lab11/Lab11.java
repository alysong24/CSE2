//Alyson Givre
//Lab 11

/* This program generates two arrays of random integers and then performs linear
searches on one and binary searches on the other */

import java.util.Scanner; //import scanner

public class Lab11 {
    //main method
    public static void main(String[] args) {
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //initialize arrays
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        //fill array1
        for(int i = 0; i < 50; i++) {
            //generate random number
            array1[i] = (int)(Math.random() * 101);
        }
        //initialize number value
        int number = (int)(Math.random() * 101);
        //fill array2
        for(int j = 0; j < 50; j++) {
            //add random value to number
            number += (int)(Math.random() * 11);
            //assign number to array
            array2[j] = number;
        }
        
        //print statements
        System.out.println("The maximum of array1 is: " + linMax(array1));
        System.out.println("The minimum of array1 is: " + linMin(array1));
        
        //print statements
        System.out.println("The maximum of array2 is: " + array2[49]);
        System.out.println("The minimum of array2 is: " + array2[0]);
        
        //ask user to enter an int
        System.out.print("Enter an int >= 0: ");
        //if int is not entered
        if(!scan.hasNextInt()) {
            //print statement
            System.out.println("You did not enter an int");
            //end program
            return;
        }
        //save input value
        int input = scan.nextInt();
        //if int is not in range
        if(input < array2[0] | input > array2[49]) {
            //print statement
            System.out.println("You did not enter a valid int");
            //end program
            return;
        }
        //if int is negative
        if(input < 0) {
            //print statement
            System.out.println("You did not enter an int >= 0");
            //end program
            return;
        }
        //call binary search method
        binSearch(input, array2);
        
    } //end main method
    
    //linMax method
    public static int linMax(int[] array) {
        //initialize max value
        int max = 0;
        //check array values
        for(int i = 0; i < array.length; i++) {
            //check if number is greater than max value
            if (array[i] > max) {
                //save value
                max = array[i];
            }
        }
        //return statement 
        return max;
    } //end linMax method
    
    //linMin method
    public static int linMin(int[] array) {
        //initialize min value
        int min = array[0];
        //check array values
        for(int i = 0; i < array.length; i++) {
            //if array value is less than the min
            if(array[i] < min) {
                //assign array value
                min = array[i];
            }
        }
        //return statement
        return min;
    } //end linMin method
    
    //binSearch method
    public static void binSearch(int num, int[] array) {
        //initialize values
        int length = array.length;
        int first = 0;
        int last = length - 1;
        int middle = (first + last) / 2;

        //loop to find num value
        while(first <= last) {
            //if middle is less than num value
            if(array[middle] < num) {
                //change first value
                first = middle + 1;
            }
            //if middle is greater than num value
            else if(array[middle] > num) {
                //change last value
                last = middle - 1;
            }
            //if middle value equals num value
            else if(array[middle] == num) {
                //print that value was found
                System.out.println(num + " was found in the list");
                //return statement
                return;
            }
            //change middle value
            middle = (first + last) / 2;
        }
        //print statements
        System.out.println(num + " was not found in the list");
        System.out.println("The number above the key was " + array[first]);
        System.out.println("The number below the key was " + array[first - 1]);
        
        //return statement
        return;
        
    } //end binSearch method
    
}//end class