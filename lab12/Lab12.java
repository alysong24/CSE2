//Alyson Givre
//Lab 12
 
/* This program 
*/

public class Lab12 {
    //main method
    public static void main(String[] args) {
        //generate random widths and heights
        int width1 = (int)(Math.random() * 5 + 1);
        int width2 = (int)(Math.random() * 5 + 1);
        int height1 = (int)(Math.random() * 5 + 1);
        int height2 = (int)(Math.random() * 5 + 1);
        
        //create arrays
        int[][] A = new int[height1][width1];
        A = increasingMatrix(width1, height1, true);
        int[][] B = new int[width1][height1];
        B = increasingMatrix(height1, width1, false);
        int[][] C = new int[height2][width2];
        C = increasingMatrix(width2, height2, true);
        
        //print matrices
        System.out.println("Matrix A: ");
        printMatrix(A, true);
        System.out.println("Matrix B: ");
        printMatrix(B, false);
        System.out.println("Matrix C: ");
        printMatrix(C, true);
        
        
        //translate and print Matrix B
        System.out.println("Translate Matrix B to row major: ");
        //create new array
        int[][] newB  = new int[height1][width1];
        newB = translate(B);
        printMatrix(newB, true);
        
        //create new matrix
        int[][] added = new int[height1][width1];
        added = addMatrix(A, true, B, false);
        //print matrix
        System.out.println("Matrix A + Matrix B = ");
        printMatrix(added, true);
    } //end main method
    
    //increasingMatrix method
    public static int[][] increasingMatrix(int width, int height, 
    boolean format) {
        //create array
        int[][] array = new int[height][width];
        //create counter variable
        int counter = 1;
        //if row matrix
        if(format == true) {
            //assign values to matrix
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    //assign value
                    array[i][j] = counter;
                    //increase counter
                    counter++;
                }
            }
        }
        
        //reset counter value
        counter = 1;
        //if column matrix
        if(format == false) {
           //assign values to matrix
           for(int k = 0; k < width; k++) {
               for(int m = 0; m < height; m++) {
                   //assign value
                   array[m][k] = counter;
                   //increase counter
                   counter++;
               }
           }
        }
        //return statement
        return array;
    } //end increasingMatrix method
    
    //printMatrix method
    public static void printMatrix(int[][] array, boolean format) {
        //if row matrix
        if(format == true) {
            //print matrix
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
            //return statement
            return;
        }
        //if column matrix
        else if(format == false) {
            //print matrix
            for(int k = 0; k < array[0].length; k++) {
                //print
                System.out.print("[ ");
                for(int m = 0; m < array.length; m++) {
                    //print value
                    System.out.print(array[m][k] + " "); 
                }
                //print
                System.out.print("]\n");
            }
            //return statement
            return;
        }
        //if void matrix
        else if(array == null) {
            //print statement
            System.out.println("The array was empty!");
            //return statement
            return;
        }
    } //end printMatrix method
    
    //translate method
    public static int[][] translate(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        
        //create temp value
        int temp;
        
        //create array
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                //find value
                temp = array[i][j];
                newArray[j][i] = temp;
            }
        }
        //return statement
        return newArray;
    } //end translate method
    
    //addMatrix method
    public static int[][] addMatrix(int[][] A, boolean formatA, int[][] B, 
    boolean formatB) {
        //if A is column major
        if(formatA == false) {
            //create new array
            int[][] newA = new int[A[0].length][A.length];
            //translate A
            newA = translate(A);
            //call addMatrix method again
            return addMatrix(newA, true, B, formatB);
        }
        //if B is column major
        if(formatB == false) {
            //create new array
            int[][] newB = new int[B[0].length][B.length];
            //translate A
            newB = translate(B);
            //call addMatrix method again
            return addMatrix(A, formatA, newB, true);
        }
        //check if matrices can be added
        if(A.length != B.length | A[0].length != B[0].length) {
            //print statement
            System.out.println("The matrices cannot be added!");
            //return statement
            return null;
        }
        //create new array
        int[][] added = new int[A.length][A[0].length];
        //add arrays
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                //add numbers
                added[i][j] = A[i][j] + B[i][j];
            }
        }
        //return statement
        return added;
    } //end addMatrix method
 
} //end class
