//Alyson Givre
//Lab 12
 
/* This program 
*/

public class Lab12 {
    //main method
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array = increasingMatrix(3, 3, false);
        printMatrix(array, false);
    } //end main method
    
    //increasingMatrix method
    public static int[][] increasingMatrix(int width, int height, boolean format) {
        //create array
        int[][] array = new int[width][height];
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
        counter = 0;
        //if column matrix
        if(format == false) {
           //assign values to matrix 
           for(int k = 0; k < width; k++) {
               //reset counter
               counter = k + 1;
               for(int m = 0; m < height; m++) {
                   //assign value
                   array[m][k] = counter;
                   //increase counter
                   counter+=width;
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
            for(int k = 0; k < array.length; k++) {
                //print
                System.out.print("[ ");
                for(int m = 0; m < array[k].length; m++) {
                    //print value
                    System.out.print(array[k][m] + " "); 
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
        int[][] newArray = new int[array.length][];
    } //end translate method
    
} //end class

/* System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2] + " " + array[0][3]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2] + " " + array[1][3]);
        System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2] + " " + array[2][3]);
        System.out.println(array[3][0] + " " + array[3][1] + " " + array[3][2] + " " + array[3][3]); */