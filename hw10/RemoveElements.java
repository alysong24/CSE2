//Alyson Givre
//Homework 10

/* This program creates a random array of 10 numbers and then asks the user 
which elements they want to remove */

import java.util.Scanner; //import scanner

public class RemoveElements {
    //main method
    public static void main(String [] arg){
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        //initialize arrays
        int num[] = new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
	    String answer = "";
	    do{
  	        System.out.print("Random input 10 ints [0-9]");
  	        num = randomInput();
  	        String out = "The original array is:";
  	        out += listArray(num);
  	        System.out.println(out);
 
  	        System.out.print("Enter the index ");
  	        index = scan.nextInt();
  	        newArray1 = delete(num,index);
  	        String out1 = "The output array is ";
  	        out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
 
            System.out.print("Enter the target value ");
  	        target = scan.nextInt();
  	        newArray2 = remove(num,target);
  	        String out2 = "The output array is ";
  	        out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2);
  	 
  	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	        answer = scan.next();
	    } while(answer.equals("Y") || answer.equals("y")); 
    } //end main method
    
    //listArray method
    public static String listArray(int num[]) {
	    String out = "{";
	    for(int j = 0; j < num.length; j++) {
  	        if(j > 0) {
    	        out += ", ";
  	        }
  	    out += num[j];
	    }
	    out += "} ";
	    return out;
    } //end listArray method
    
    //randomInput method
    public static int [] randomInput() {
        int num [] = new int[10];
        //declare variable
        int n;
        for(int i = 0; i <= 9; i++) {
            //generate random number
            n = (int) (Math.random() * 10);
            //assign number to space in array
            num[i] = n;
        }
        return num;
    } //end randomInput method
    
    //delete method
    public static int[] delete(int[] list, int pos) {
        //find array size
        int size = list.length;
        //create array
        int[] array = new int[--size];
        //create counter variable
        int counter = 0;
        //remove element at pos position
        for(int i = 0; i <= size; i++) {
            //if i is the pos value
            if(i == pos) {
                //break out of iteration of loop
                continue;
            }
            //assign value to array
            array[counter] = list[i]; 
            //increase counter by one
            counter++;
        }
        //return statement
        return array;
    } //end delete method
    
    //remove method
    public static int[] remove(int[] list, int target) {
        //find length of list
        int size = list.length;
        //initialize counter variable
        int counter = 0;
        //see if any values equal target value
        for(int i = 0; i < size; i++) {
            //check if value equals target
            if(list[i] == target) {
                //increase counter
                counter++;
            }
        }
        //create new array
        int[] array = new int[size - counter];
        //create second counter variable
        int counter2 = 0;
        //assign values to array
        for(int j = 0; j <= size; j++) {
            //if value is equal to target
            if(list[j] == target) {
                //break out of iteration of loop
                continue;
            }
            //assign values to array
            array[counter2] = list[j];
            //increase counter by one
            counter2++;
            //if array is correct size
            if(counter2 == (size - counter)) {
                //exit loop
                break;
            }
        }
        //return statement
        return array;
    } //end remove method
    
}//end class
