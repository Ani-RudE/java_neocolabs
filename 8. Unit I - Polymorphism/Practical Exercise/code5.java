//Write a Multiply function for two integers
import java.util.*;

class Main {
     int Multiply(int a, int b) {
          return a * b;
     }

     int Multiply(int a, int b, int c) {
          return a * b * c;
     }

     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
          int b = scan.nextInt();
          int c = scan.nextInt();
          int d = scan.nextInt();
          int e = scan.nextInt();
          Main m = new Main();
          System.out.println(m.Multiply(a, b));
          System.out.println(m.Multiply(c, d, e));

          scan.close();
     }
}