//Alyson Givre
//Homework 13

/* This program creates a ragged 4D array with size inputted by the user full 
of random doubles between 0 and 30  */

import java.util.Scanner; //import scanner

public class FourDwin{
    //main method
    public static void main(String[] args) {
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //ask user to enter X value
        System.out.print("Enter an integer X: ");
        //check if integer
        while(!scan.hasNextInt()) {
            //tell user to enter again
            System.out.print("Invalid input. Enter again: ");
            scan.nextLine();
        }
        int x = scan.nextInt();
        //check if positive
        x = isValid(scan, x);
        
        //tell user to enter Y value
        System.out.print("Enter an integer Y where Y > X: ");
        //check if integer
        while(!scan.hasNextInt()) {
            //tell user to enter again
            System.out.print("Invalid input. Enter again: ");
            scan.nextLine();
        }
        int y = scan.nextInt();
        //check if positive and greater than x value
        y = isValid(scan, y);
        while(y < x) {
            //if y < x
            if(y < x) {
                //tell user to enter again
                System.out.print("Invalid input. Enter an integer Y where Y"  +
                    " > X: ");
                scan.nextLine();
            }
            
            //check if integer is entered
            while(!scan.hasNextInt()) {
                //tell user to enter again
                System.out.print("Invalid input. Enter again: ");
                scan.nextLine();
            }
            y = scan.nextInt();
            //check if positive
            y = isValid(scan, y);
        }
        
        //create array
        double[][][][] A = new double[3][][][];
        //2nd dimension of array
        for(int i = 0; i < A.length; i++) {
            A[i] = new double[(int) ( (Math.random() * y) + x )] [][];
            //3rd dmimension of array
            for(int j = 0; j < A[i].length; j++) {
                A[i][j] = new double[(int) ( (Math.random() * y) + x )] [];
                //4th dimension
                for(int k = 0; k < A[i][j].length; k++) {
                    A[i][j][k] = new double[(int) ( (Math.random() * y) + x )];
                }
            }
        }
        //fill array
        A = fillArray(A);
        
        //print original array
        System.out.println("Original array: ");
        printArray(A);
        
        //print sorted array
        System.out.println("Sorted array: ");
        A = sort4DArray(A);
        A = sort3DArray(A);
        printArray(A);
        
        //print array statistics
        statArray(A);
        
        
        
        
        
    } //end main method
    
    //isValid method
    public static int isValid(Scanner scan, int x) {
        while(x < 0) {
            //if x is less than 0
            if (x < 0) {
                //tell user to enter again
                System.out.print("Invalid input. Enter again: ");
                scan.nextLine();
            }
            while(!scan.hasNextInt()) {
                //tell user to enter again
                System.out.print("Invalid input. Enter again: ");
                scan.nextLine();
            }
            //save value
            x = scan.nextInt();
        }
        return x;
    } //end isValid method
    
    //fillArray method
    public static double[][][][] fillArray(double[][][][] A) {
        //fill array
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                for(int k = 0; k < A[i][j].length; k++) {
                    for(int m = 0; m < A[i][j][k].length; m++) {
                        //assign random value to array
                        A[i][j][k][m] = Math.random() * 40;
                    }
                }
            }
        }
        //return statement
        return A;
    } //end fill Array method
    
    //printArray method
    public static void printArray(double[][][][] A) {
        System.out.print("{ ");
        for(int i = 0; i < A.length; i++) {
            System.out.print("{ ");
            for(int j = 0; j < A[i].length; j++) {
                System.out.print("{ ");
                for(int k = 0; k < A[i][j].length; k++) {
                    System.out.print("{ ");
                    for(int m = 0; m < A[i][j][k].length; m++) {
                        //if m is at max value
                        if(m == (A[i][j][k].length - 1)) {
                            //print value
                            System.out.printf("%.1f", A[i][j][k][m]);
                            System.out.print(" ");
                        }
                        else {
                            //print value
                            System.out.printf("%.1f", A[i][j][k][m]);
                            System.out.print(", ");
                        }
                    }
                    System.out.print("} ");
                }
                System.out.print("} ");
            }
            System.out.print("} ");
        }
        System.out.print("} \n");
    } //printArray method
    
    //statArray method
    public static void statArray(double[][][][] A) {
        //create variables
        double sum = 0;
        int counter = 0;
        
        
        //get sum and counter variables
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                for(int k = 0; k  < A[i][j].length; k++) {
                    for(int m = 0; m < A[i][j][k].length; m++) {
                        //increase sum and counter values
                        sum += A[i][j][k][m];
                        counter++;
                    }
                }
            }
        }
        
        //print results
        System.out.println("Members: " + counter);
        System.out.print("Sum: "); 
        System.out.printf("%.1f", sum);
        System.out.print("\n");
        System.out.print("Mean: ");
        System.out.printf("%.3f", (sum / counter) );
        System.out.print("\n");
    } //end statArray method
    
    
    //sort4DArray method
    public static double[][][][] sort4DArray(double[][][][] A) {
        double[][][] temp;
        double[][][] target;
        
        for(int i = 0; i < A.length; i++) {
            temp = A[i];
            int j = i - 1;
            while(j >= 0) {
                //if length of A[i] is less than length of A[j]
                if(A[i].length < A[j].length) {
                    //switch values
                    target = A[j];
                    A[j] = temp;
                    A[i] = target;
                }
                //if lengths are equal
                if(A[i].length == A[j].length) {
                    //if min value of A[i] is greater
                    if(findMin(A[i]) > findMin(A[j])) {
                        //decrease j
                        j--;
                        //break out of iteration of loop
                        continue;
                    }
                    //if min value of A[j] is greater
                    else {
                        //swap values
                        target = A[j];
                        A[j] = temp;
                        A[i] = target;
                    }
                }
                //decrease j
                j--;
            }
        }
        //return statement
        return A;
    }//end sort4DArray method
    
    //findMin method
    public static double findMin(double[][][] A) {
        //create min value
        double min = A[0][0][0];
        //find min
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                for(int k = 0; k < A[i][j].length; k++) {
                    //if value is less than min
                    if(A[i][j][k] < min) {
                        //reassign min value
                        min = A[i][j][k];
                    }
                }
            }
        }
        //return statement
        return min;
    } //end findMin method
    
    //sort3DArray method
    public static double[][][][] sort3DArray(double[][][][] A) {
        //sort innermost loop
        for(int x = 0; x < A.length; x++) {
            for(int y = 0; y < A[x].length; y++) {
                for(int z = 0; z < A[x][y].length; z++) {
                    java.util.Arrays.sort(A[x][y][z]);
                }
            }
        }
        
        
        //create min value
        int min = A[0][0].length;
        //create swap values
        double[][] temp;
        double[][] target;
        //create counter variable
        int counter = 0;
        
        //selection sort
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                //if array length is less than min
                if(A[i][j].length < min) {
                    temp = A[i][j];
                    target = A[i][counter];
                    //swap values
                    A[i][j] = target;
                    A[i][counter] = temp;
                }
            }
            //reset counter
            counter = 0;
        }
        //return statement
        return A;
    } //end sort3DArray method
    
    
} //end class


        
