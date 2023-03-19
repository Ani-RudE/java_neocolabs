import java.util.*;

abstract class AbstractClass {
     int val;

     abstract int getValue();

     abstract int divisorSum(int n);
}

class Calculator extends AbstractClass {
     public int getValue() {
          Scanner in = new Scanner(System.in);
          val = in.nextInt();
          in.close();
          return val;
     }

     public int divisorSum(int n) {
          int sum = 0;
          for (int i = 1; i <= n; i++) {
               if (n % i == 0) {
                    sum += i;
               }
          }
          return sum;
     }
}

class Solution {
     public static void main(String[] args) {
          Calculator calObj = new Calculator();
          int value = calObj.getValue();
          int a = calObj.divisorSum(value);
          System.out.println(a);
     }
}