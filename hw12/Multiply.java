//Alyson Givre
//Homework 12

/* This program asks the user to input height and width values of two arrays, 
determines if they can be multiplied, and then multiplies them */

import java.util.Scanner; //import scanner
import java.util.Random; //import random generator

public class Multiply {
    //main method
    public static void main(String[] args) {
       //declare and construct scanner
       Scanner scan = new Scanner(System.in);
       //declare and construct random generator
       Random rand = new Random();
       
       //ask user to enter the width and height of matrices
       System.out.print("Please enter an int for the width of Matrix 1: ");
       int width1 = isValid(scan); //save val
       System.out.print("Please enter an int for the height of Matrix 1: ");
       int height1 = isValid(scan); //save val
       System.out.print("Please enter an int for the width of Matrix 2: ");
       int width2 = isValid(scan); //save val
       System.out.print("Please enter an int for the height of Matrix 2: ");
       int height2 = isValid(scan); //save val
       
       //check if matrices are compatible
       while(width1 != height2) {
            //print that the matrices are incompatible
            System.out.println("These matrices cannot be multiplied. Enter" +
                " values again.");
            System.out.print("Please enter an int for the width of Matrix 1: ");
            width1 = isValid(scan); //save val
            System.out.print("Please enter an int for the height of Matrix 1: ");
            height1 = isValid(scan); //save val
            System.out.print("Please enter an int for the width of Matrix 2: ");
            width2 = isValid(scan); //save val
            System.out.print("Please enter an int for the height of Matrix 2: ");
            height2 = isValid(scan); //save val
        }
       
       
       //generate arrays
       int[][] matrix1 = new int[height1][width1];
       int[][] matrix2 = new int[height2][width2];
       matrix1 = randomMatrix(width1, height1, rand);
       matrix2 = randomMatrix(width2, height2, rand);
       
       //print arrays
       System.out.println("Matrix 1 is: ");
       printMatrix(matrix1); //call method
       System.out.println("Matrix 2 is: ");
       printMatrix(matrix2); //call method
       
       //create new array
       int[][] multMatrix = new int[height1][width2];
       //multiply arrays
       multMatrix = matrixMultiply(matrix1, matrix2);
       //print matrix
       System.out.println("Matrix 1 * Matrix 2 equals: ");
       printMatrix(multMatrix);
    }//end main method
    
    //isValid method
    public static int isValid(Scanner scan) {
        //initialize val
        int val;
        //if int not entered
        while(!scan.hasNextInt()) {
           //print statement
           System.out.print("Invalid input. Please enter an int: ");
           //scan for input
           scan.nextLine();
       }
       //save value
       val = scan.nextInt();
       //if int is negative
       while(val <= 0) {
           //if int is less than or equal to 0
           if(val <= 0) {
               //print statement
               System.out.print("Invalid input. Please enter a positive int: ");
           }
           //check if input is an int
           while(!scan.hasNextInt()) {
               //print statement
               System.out.print("Invalid input. Please enter an int: ");
               //scan for input
               scan.nextLine();
           }
           //save value
           val = scan.nextInt();
       }
       //return statement
       return val;
    } //end isValid method
    
    //randomMatrix method
    public static int[][] randomMatrix(int width, int height, Random rand) {
        //create array
        int[][] array = new int[height][width];
        
        //assign values to array
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                array[i][j] = rand.nextInt(21) - 10;
            }
        }
        
        //return statement
        return array;
    } //end randomMatrix method
    
    //printMatrix method
    public static void printMatrix(int[][] array) {
        //find 
        for(int i = 0; i < array.length; i++) {
            //print
            System.out.print("[ ");
            for(int j = 0; j < array[i].length; j++) {
                //print value
                System.out.print(array[i][j] + " ");
            }
            //print
            System.out.print("]\n");
        }
    } //end printMatrix method
    
    //matrixMultiply method
    public static int[][] matrixMultiply(int[][] array1, int[][] array2) {
        //find dimensions of array
        int height = array1.length;
        int width = array2[0].length;
        //check if matrices can be multiplied
        while(array1[0].length != array2.length) {
            //print that the matrices are incompatible
            System.out.println("These matrices cannot be multiplied.");
            //create void array
            int[][] voidArray = new int[0][0];
            //return void array
            return voidArray;
        }
        //create new array
        int[][] multArray = new int[height][width];
        //find values for array 
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                for(int k = 0; k < array1[i].length; k++) {
                    //assign value to array
                    multArray[i][j] += (array1[i][k] * array2[k][j]);
                }
            }
        }
        //return matrix
        return multArray;
    } //end matrixMultiply method
    
} //end class