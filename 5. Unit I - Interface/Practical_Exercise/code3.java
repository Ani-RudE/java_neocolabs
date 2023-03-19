import java.util.*;
// import java.io.*;

interface in1 {
     final int a = 10;

     void display();
}

class testClass implements in1 {
     public void display() {
          String sr;
          Scanner scan = new Scanner(System.in);
          sr = scan.nextLine();
          System.out.println(sr);

          scan.close();
     }

     public static void main(String[] args) {
          testClass t = new testClass();
          t.display();
          System.out.println(a);
     }
}