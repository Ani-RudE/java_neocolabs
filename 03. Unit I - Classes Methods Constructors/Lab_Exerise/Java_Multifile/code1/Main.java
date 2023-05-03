import java.util.Scanner;

// The main class that contains the main method
public class Main {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          // Get input from the user for the first number
          // System.out.print("Enter the first number: ");
          double num1 = scanner.nextDouble();
          // Get input from the user for the second number
          // System.out.print("Enter the second number: ");
          double num2 = scanner.nextDouble();
          // Create an object of the Calculator class
          Calculator calculator = new Calculator();
          // Call the methods of the Calculator class to perform various operations
          System.out.println("Sum: " + calculator.add(num1, num2));
          System.out.println("Difference: " + calculator.subtract(num1, num2));
          System.out.println("Product: " + calculator.multiply(num1, num2));
          System.out.println("Quotient: " + calculator.divide(num1, num2));
          System.out.println("Modulus: " + calculator.modulus(num1, num2));
     }
}



//Calculator.java
class Calculator {
     // The methods that perform various calculations
     public double add(double num1, double num2) {
          return num1 + num2;
     }

     public double subtract(double num1, double num2) {
          return num1 - num2;
     }

     public double multiply(double num1, double num2) {
          return num1 * num2;
     }

     public double divide(double num1, double num2) {
          return num1 / num2;
     }

     public double modulus(double num1, double num2) {
          return num1 % num2;
     }
}