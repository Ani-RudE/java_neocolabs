import java.io.*;
import java.util.Scanner;

interface in1 {
     final int a = 10;

     void display();
}

class testClass implements in1 {
     public void display() {
          String sr;
          Scanner sc = new Scanner(System.in);
          sr = sc.nextLine();
          System.out.println(sr);
     }

     public static void main(String[] args) {
          testClass t = new testClass();
          t.display();
          System.out.println(a);
     }
}