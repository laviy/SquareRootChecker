import java.util.Scanner;

public class SquareRoot {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Please enter an integer");
      double integer = scnr.nextInt();
      

      if(integer > 0) {
         System.out.println("The square root of " + integer + " is " + Math.sqrt(integer));
         }
      else {
         System.out.println("Error, can't find square root.");
         System.out.println("Please press 't' to try again.");
         }
   }
}
 
      
            
      
     