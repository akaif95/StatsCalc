package statistics;
import java.util.Scanner;

//This class uses the StatCalc Class to calculate some basic statistics
//Think of this as the MAIN Class
public class Statistics {

    public static void main(String[] args) {
        //Use this since we want input from a user
        Scanner in = new Scanner(System.in);
        
        //Create an Object. Keep in mind that the new variable does not actually
        //Store a Class, but rather a pointer TO the class
        StatCalc myStatCalc;
        myStatCalc = new StatCalc();
        
        double nextNumber;
        
        System.out.println("To calculate some basic stats, please enter some numbers. Enter 0 when finished");
        System.out.println();
        
        //Have a do-while loop take in numbers as long as we don't enter 0.
        //However, we can improve upon this later since 0 may pop up from time to time in stats
        do {
            System.out.println("Enter a number ---->   ");
            nextNumber = in.nextDouble();
            
            if (nextNumber != 0)
                myStatCalc.enter(nextNumber);
        } while(nextNumber !=0);
        
        System.out.println("The number of values in our dataset is: " + myStatCalc.getCount());
        System.out.println();
        
        System.out.println("The Mean of the values in our dataset is: " + myStatCalc.getMean());
        System.out.println();
        
        System.out.println("The Standard Deviation of the values in our dataset is: " + myStatCalc.getStandardDeviation());
        System.out.println();
            
        }
}
        
        
        
        

    
    

