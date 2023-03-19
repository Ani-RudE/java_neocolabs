// Write a program to convert Celsius to Fahrenheit
import java.util.*;

class Main{

     public static void main(String[] args) {
          double f, c;

          Scanner s = new Scanner(System.in);

          c=s.nextInt();

          f=1.8*c+32;
          System.out.println(f);

          s.close();
     }
}