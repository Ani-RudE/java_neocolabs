//Write a Multiply function for two integers
import java.util.*;

class Main {
     int Multiply(int a, int b) {
          return a * b;
     }

     double Multiply(double a, double b) {
          return a * b;
     }

     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
          int b = scan.nextInt();
          double c = scan.nextDouble();
          double d = scan.nextDouble();
          Main m = new Main();
          System.out.println(m.Multiply(a, b));
          System.out.println(m.Multiply(c, d));

          scan.close();
     }
}