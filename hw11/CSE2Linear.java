//Alyson Givre
//Homework 11

/* This program asks the user to enter 15 grades to an array. These grades are 
then sorted. The user then searches for a number using a binary search. Then 
the array is scrambled and the user uses a linear search to find another 
number */

import java.util.Scanner; //import scanner
import java.util.Random; //import random method

public class CSE2Linear {
    //main method
    public static void main(String[] args) {
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        //declare random generator
        Random randomGenerator = new Random();
        
        //create array
        int[] grades = new int[15];
        
        //print statement
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        //create number value
        int num;
        //scan for results
        for(int i = 0; i < 15; i++) {
            //if input entered is not an int
            if(!scan.hasNextInt()) {
                System.out.print("Int not entered. Enter again: ");
                //decrease i
                i--;
                scan.nextLine();
                //break out of iteration of loop
                continue;
            }
            //save number value
            num = scan.nextInt();
            //if input entered is out of range
            if(num < 0 | num > 100) {
                //print statement
                System.out.print("Int entered is out of range. Enter again: ");
                //decrease i
                i--;
                //break out of iteration of loop
                continue;
            }
            //save grade value to array
            grades[i] = num;
        }
        
        //print statement
        System.out.print("The grades, sorted, are: ");
        //sort array
        java.util.Arrays.sort(grades);
        //print out sorted array
        for(int j = 0; j < grades.length; j++) {
            System.out.print(grades[j] + " ");
        }
        //print line break
        System.out.print("\n"); 
        
        //tell user to enter a grade
        System.out.print("Enter a grade to search for: ");
        //scan for input
        scan.nextLine();
        //if input is not an int
        while(!scan.hasNextInt()) {
            //print statement
            System.out.print("Invalid input. Enter again: ");
            //scan for next input
            scan.nextLine();
        }
        //save value
        int val = scan.nextInt();
        binSearch(grades, val);
        
        //print statement
        System.out.println("Scrambled: ");
        //scramble array
        scramble(grades, randomGenerator);
        //print array
        for(int k = 0; k < 15; k++) {
            //print statement
            System.out.print(grades[k] + " ");
        }
        //print line break
        System.out.print("\n");
        
        //tell user to enter a value to search for
        System.out.print("Enter a grade to search for: ");
        //scan for input
        scan.nextLine();
        //if input is not an int
        while(!scan.hasNextInt()) {
            //print statement
            System.out.print("Invalid input. Enter again: ");
            //scan for next input
            scan.nextLine();
        }
        //save value
        int searchVal = scan.nextInt();
        //call linSearch method
        linSearch(grades, searchVal);
    } //end main method
    
    //binSearch method
    public static void binSearch(int[] array, int num) {
        //initialize values
        int length = array.length;
        int first = 0;
        int last = length - 1;
        int middle = (first + last) / 2;
        int counter = 0;

        //loop to find num value
        while(first <= last) {
            //increase counter
            counter++;
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
                System.out.println(num + " was found in the list with " + 
                    counter + " iterations");
                //return statement
                return;
            }
            //change middle value
            middle = (first + last) / 2;
        }
        //print statement
        System.out.println(num + " was not found in the list with " +
            counter + " iterations");
            //return statement 
            return;
    } //end binSearch method
    
    //scramble method
    public static int[] scramble(int[] array, Random randomGenerator) {
        //create target and temp variables
        int target;
        int temp;
        
        //use loop to scramble array
        for(int i = 0; i < array.length; i++) {
            //generate random variable
            target = randomGenerator.nextInt(array.length);
            
            //switch values
            temp = array[target];
            array[target] = array[i];
            array[i] = temp;
        }
        
        //return statement
        return array;
    } //end scramble method
    
    
    //linSearch method
    public static void linSearch(int [] array, int val) {
        //create counter variable
        int counter = 0;
        //check array for val
        for(int i = 0; i < array.length; i++) {
            //increase counter value
            counter++;
            //if array value is less than the min value
            if(array[i] == val) {
                //print statement
                System.out.println(val + " was found in the list with " + 
                    counter + " iterations" );
                //return statement
                return;
            }
        }
        //print statement
        System.out.println(val + " was not found in the list with " + 
            counter + " iterations" );
        //return statement
        return;
    } //end linSearch method
    
    
} //end class