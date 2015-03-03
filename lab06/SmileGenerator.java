//Alyson Givre
//Lab 6

// This program generates a random number (between 1 and 100) of smiley faces

public class SmileGenerator {
    
    public static void main(String[] args) {

        //print out Step 1
        System.out.println("Step 1");
        
        //print 5 smileys using a for loop
        for(int counter = 5; counter > 0; counter--) {
            //print smiley
            System.out.print(":) ");
        }
        //print line
        System.out.print("\n \n");

        //create counter variable
        int counter = 5;
        //print 5 smileys using a while loop
        while(counter > 0) {
            //print smiley
            System.out.print(":) ");
            //decrease counter
            counter--;
        }
        //print line
        System.out.print("\n \n");
        
        //print 5 smileys using a do-while loop
        do {
            //print smiley
            System.out.print(":) ");
            //increase smiley
            counter++;
        } while(counter < 5);
        //print line
        System.out.print("\n \n");
        
        //create limiting variable
        int counter2 = 30;
        
        //print Step 2 and 3
        System.out.println("Step 2 and 3");
        //generate random number of smileys
        for(int number = (int)(Math.random() * 100); number > 0; number--) {
            //print smiley
            System.out.print(":) ");
            //decrease counter by one
            counter2--;
            //if counter2 equals 30 insert a line break
            while(counter2 == 0) {
                //line break
                System.out.print("\n");
                //reset counter
                counter2 = 30;
                //end loop
                break;
            }
        }
        //print line
        System.out.print("\n \n");
        
        //Print Step 4
        System.out.println("Step 4");
        //generate random number between 0 and 30
        int number2  = (int) (Math.random() * 30);
        //initialize counter variable
        int counter3 = 1;
        
        for(int i = 1; i <= number2; i++) {
            for(int j = 1; j <= i; j++ ) {
                //print smiley
                System.out.print(":) ");
                //check if j equals 1
                if (j == i) {
                    //print line break
                    System.out.print("\n");
                }
            }
        }
        //print line break
        System.out.print("\n");

    }//end main method
    
} //end class