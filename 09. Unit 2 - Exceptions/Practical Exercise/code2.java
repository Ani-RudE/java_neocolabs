//Input an integer as dividend
import java.util.*;

class Q01Simple_List {
     public static void main(String[] args) throws java.lang.Exception {
          Scanner scan = new Scanner(System.in);
          // Enter dividend
          try {
               int dividend = scan.nextInt();
               // Enter divisor
               int divisor = scan.nextInt();

               try {
                    System.out.println(dividend / divisor);
               } catch (ArithmeticException e) {
                    System.out.println(e);
               }
          } catch (Exception e) {
               System.out.println(e);
          }

          scan.close();
     }
}