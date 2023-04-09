//Main.java
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          // System.out.print("Enter two numbers: ");
          int num1 = scan.nextInt();
          int num2 = scan.nextInt();
          Number n1 = new Number(num1);
          Number n2 = new Number(num2);
          System.out.println(n1.add(n2).getValue());
          // System.out.print("Enter two strings: ");
          String str1 = scan.next();
          String str2 = scan.next();
          StringWrapper s1 = new StringWrapper(str1);
          StringWrapper s2 = new StringWrapper(str2);
          System.out.println(s1.add(s2).getValue());

          scan.close();
     }
}