import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if(scan.hasnextInt() ) {
            int a = scan.nextInt();
        }
        System.out.println(a);
        
        double[][] array = new double[5][5];
        array = createMatrix(array);
        System.out.println("Array 1");
        printMatrix(array);
        double[] array2 = new double[5];
        array2 = getSums(array);
        System.out.println("Array 2");
        printMatrix(array2);
        
        
    } //end main method
    
    //createMatrix method
    public static double[][] createMatrix(double[][] array) {
        for(int i = 0; i < array.length; i ++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = Math.random() * 5;
            }
        }
        return array;
    } //end createMatrix method
    
    //printMatrix method
    public static void printMatrix(double[][] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print("[ ");  
            for(int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("]\n");
        }
    } //end printMatrix method
    
    //printMatrix method
    public static void printMatrix(double[] array) {
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    } //end printMatrix method
    
    //getSum method
    public static double getSum(double[] array) {
        double sum = 0;
        for(double i: array) {
            sum += i;
        }
        return sum;
    } //end getSum method
    
    //getSums method
    public static double[] getSums(double[][] array) {
        double[] newArray = new double[array.length];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = getSum(array[i]);
        }
        return newArray;
    } //end getSums method
    
} //end class