package statistics;

public class StatCalc {
    private int count; 
   private double sum;  
   private double squareSum;  

   public void enter(double num) {
          count++;
          sum += num;
          squareSum += num*num;
   }

   public int getCount() {
          return count;
   }
 

   public double getSum() {
          return sum;
   }
 
   public double getMean() {
          return sum / count;
   }
 

   public double getStandardDeviation() {
          double mean = getMean();
          return Math.sqrt( squareSum/count - mean*mean );
   }         
    
}
