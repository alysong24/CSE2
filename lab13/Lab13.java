//Alyson Givre
//Lab 13

/* This program creates a two dimensional ragged array and then makes all the 
member arrays the same length */

public class Lab13 {
    //main method
    public static void main(String[] args) {
        //create array
        int[][] A = new int[5][];
        int counter = 5;
        for(int i = 0; i < A.length; i++) {
            A[i] = new int[counter];
            counter += 3;
        }
        //fillArray
        A = fillArray(A);
        
        //print unsorted array
        System.out.println("Array before sorting: ");
        for(int j = 0; j < A.length; j++) {
            printRow(j, A);
        }
        
        //sort array
        A = sortRows(A);
        
        //print sorted array
        System.out.println("Array after sorting: ");
        for(int k = 0; k < A.length; k++) {
            printRow(k, A);
        }
        
        //create new array
        int longest = findLongest(A);
        int[][] B = new int[5][A[longest].length];
        
        //fill array
        B = fillZero(A, B);
        //print B
        System.out.println("Array after sorting and copying: ");
        for(int m = 0; m < B.length; m++) {
            printRow(m, B);
        }
        
    } //end main method
    
    //fillArray method
    public static int[][] fillArray(int[][] A) {
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                //fill with random int
                A[i][j] = (int)(Math.random() * 40);
            }
        }
        //return A
        return A;
    } //end fillArray method
    
    //printRow method
    public static void printRow(int row, int[][] A) {
        for(int i = 0; i < A[row].length; i++) {
            //print
            System.out.print(A[row][i] + " ");
        }
        System.out.print("\n");
    } //end printRow method
    
    //sortRows method
    public static int[][] sortRows(int [][] A) {
        for(int i = 0; i < A.length; i++) {
            //call sort method
            java.util.Arrays.sort(A[i]);
        }
        //return array
        return A;
    } //end sortRows method
    
    //findLongest method
    public static int findLongest(int[][] A) {
        int longest = A[0].length;
        for(int i = 0; i < A.length; i++) {
            if(A[i].length > longest) {
                longest = i;
            }
        }
        //return longest
        return longest;
    } //end findLongest method
    
    //fillZero method
    public static int[][] fillZero(int[][] A, int [][] B) {
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                B[i][j] = A[i][j];
            }
        }
        //return B
        return B;
    } //end fill Zero method
    
} //end class