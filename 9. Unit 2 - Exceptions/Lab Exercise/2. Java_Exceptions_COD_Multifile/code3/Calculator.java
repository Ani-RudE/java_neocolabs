//Create a Java Program that takes two integers to input from the user
//Calculator.java
public class Calculator {
     public static int divide(int num1, int num2) throws ArithmeticException {
          if (num2 == 0)
          {
               throw new ArithmeticException("Cannot divide by zero");
          }
          
          return num1 / num2;
     }
}