//Alyson Givre
//Lab 6

// This program generates a random number (between 1 and 100) of smiley faces

public class SmileGenerator {
    
    public static void main(String[] args) {

        /* //print 5 smileys using a for loop
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
        System.out.print("\n \n"); */
        
        /*int number2  = (int) (Math.random() * 30);
        int counter3 = 1;
        do {
            System.out.print(":) " + counter3);
            counter3++;
            if (counter3 == number2) {
                counter3 = 0;
                number2--;
                System.out.print("\n");
            }
        } while (counter3 < number2); */
        
        int number2  = (int) (Math.random() * 30);
        int counter3 = 1;
        int counter4 = 0;
        do {
            System.out.print(":) ");
            counter3--;
            if (counter3 == 0) {
                System.out.print("\n");
                counter3 = counter4;
                counter4++;
            }
        } while(counter3 <= number2);
        
    
    }//end main method
    
} //end class