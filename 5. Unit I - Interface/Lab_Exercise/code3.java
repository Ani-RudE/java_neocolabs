//Create an interface ShapeCalculator.
import java.util.*;

interface ShapeCalculator {
     void calc(int n);
}

class Square implements ShapeCalculator {
     int ar, pr;

     public void calc(int s) {
          ar = s * s;
          pr = 4 * s;
          System.out.print(ar + " " + pr + "\n");
     }
}

class Circle implements ShapeCalculator {
     double ar, pr;
     double pi = 3.14;

     public void calc(int r) {
          ar = Math.round(pi * r * r * 100.0) / 100.0;
          pr = Math.round(2 * pi * r * 100.0) / 100.0;
          System.out.println(ar + " " + pr);
     }
}

class CalcMain {
     public static void main(String args[]) {
          int n;
          Scanner scan = new Scanner(System.in);
          n = scan.nextInt();
          Square sq = new Square();
          sq.calc(n);
          Circle cr = new Circle();
          cr.calc(n);

          scan.close();
     }
}