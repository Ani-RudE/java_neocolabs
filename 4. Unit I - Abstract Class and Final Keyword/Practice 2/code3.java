import java.util.*;

abstract class marks {
     abstract public void getPercentage();
}

class A extends marks {
     // DecimalFormat d = new DecimalFormat("0.00");
     public int marks1;
     public int marks2;
     public int marks3;

     A() {
          this.marks1 = 0;
          this.marks2 = 0;
          this.marks3 = 0;
     }

     A(int m1, int m2, int m3) {
          this.marks1 = m1;
          this.marks2 = m2;
          this.marks3 = m3;
     }

     public void getPercentage() {
          int total = marks1 + marks2 + marks3;
          double percent = (total / 300.0) * 100.0;
          System.out.printf("%.2f", percent);
     }
}

class B extends marks {
     // DecimalFormat d = new DecimalFormat("0.00");
     public int marks1;
     public int marks2;
     public int marks3;
     public int marks4;

     B() {
          this.marks1 = 0;
          this.marks2 = 0;
          this.marks3 = 0;
          this.marks4 = 0;
     }

     B(int m1, int m2, int m3, int m4) {
          this.marks1 = m1;
          this.marks2 = m2;
          this.marks3 = m3;
          this.marks4 = m4;
     }

     public void getPercentage() {
          int total = marks1 + marks2 + marks3 + marks4;
          double percent = (total / 400.0) * 100.0;
          System.out.printf("%.2f", percent);
     }
}

class Main {
     public static void main(String args[]) {
          A a = new A();
          Scanner scan = new Scanner(System.in);
          a.marks1 = scan.nextInt();
          a.marks2 = scan.nextInt();
          a.marks3 = scan.nextInt();
          a.getPercentage();
          System.out.println();

          B b = new B();
          b.marks1 = scan.nextInt();
          b.marks2 = scan.nextInt();
          b.marks3 = scan.nextInt();
          b.marks4 = scan.nextInt();
          b.getPercentage();

          scan.close();
     }
}