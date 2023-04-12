//Write a Java Program that prompts the suer to input an integer value between 1 and 10
//Main.java
import java.util.*;

public class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          // System.out.print("Enter a number between 1 and 10: ");
          int num = scan.nextInt();
          
          try
          {
               RangeChecker.checkInRange(num);
               System.out.println("Number is within range");
          }
          catch (OutOfRangeException e)
          {
               System.out.println("Number is out of range");
          }

          scan.close();
     }
}