//Create a Java Program that takes two integers to input from the user
//Main.java
import java.util.*;

public class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          // System.out.print("Enter a number: ");
          int num1 = scan.nextInt();
          // System.out.print("Enter another number: ");
          int num2 = scan.nextInt();
          
          try
          {
               int result = Calculator.divide(num1, num2);
               System.out.println(num1 + " / " + num2 + " = " + result);
          }
          catch (ArithmeticException e)
          {
               System.out.println("Error: " + e.getMessage());
          }

          scan.close();
     }
}