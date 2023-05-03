import java.io.*;
import java.util.*;

class Test {
     static <T> void genericDisplay(T element) {
          System.out.println(element.getClass().getName() +
                    " = " + element);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n;
          double d;
          n = sc.nextInt();
          d = sc.nextDouble();
          genericDisplay(n);
          genericDisplay(d);
     }
}