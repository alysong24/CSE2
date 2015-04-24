public class test2 {
    public static void main(String[] args) {
        int[][] A = new int[4][2];
        int[][] B = new int[4][];
    
        A[0][0] = 3; A[0][1] = 2; A[1][0] = 7; A[2][0] = 1; A[3][0] = 2;
        
        B = flatten(A);
        printMatrix(B);
    } //end main method
    
    //printMatrix method
    public static void printMatrix(int[][] array) {
        //find 
        for(int i = 0; i < array.length; i++) {
            //print
            System.out.print("[ ");
            for(int j = 0; j < array[i].length; j++) {
                //print value
                System.out.print(array[j][i] + " ");
            }
            //print
            System.out.print("]\n");
        }
    } //end printMatrix method
    
    //findLongest method
    public static int findLongest(int[][] array) {
        int longest = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i].length > longest) {
                longest = array[i].length;
            }
        }
        return longest;
    } //end findLongest method
    
    //flatten method
    public static int[][] flatten(int[][] array) {
        int longest = findLongest(array);
        int[][] newArray = new int[array.length][longest];
        
        for(int i = 0; i < array.length; i++) {
            newArray[i] = makeZero(longest);
            for(int j = 0; j < array[i].length; j++){
                newArray[i][j] = array[i][j];
            }
        }
        return newArray;
    } //end flatten method
    
    //makeZero method
    public static int[] makeZero(int size) {
        int[] A = new int[size];
        for(int i = 0; i < A.length; i++){
            A[i] = 0; 
        }
        return A;
    } //end makeZero method
    
    
    
    
    
} //end class