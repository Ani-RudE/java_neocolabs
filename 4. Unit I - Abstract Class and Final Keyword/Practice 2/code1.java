import java.util.*;
import java.text.*;

abstract class Shape {
     abstract void rectangleArea(int l, int b);

     abstract void squareArea(int s);

     abstract void circleArea(int r);
}

class Area extends Shape {
     public void rectangleArea(int l, int b) {
          System.out.println(l * b);
     }

     public void squareArea(int s) {
          System.out.println(s * s);
     }

     public void circleArea(int r) {
          DecimalFormat d = new DecimalFormat("0.00");
          double res = Math.PI * r * r;
          System.out.println(d.format(res));
     }
}

class Main {
     public static void main(String[] args) {
          int length, breadth, radius, side;
          Scanner scan = new Scanner(System.in);
          length = scan.nextInt();
          breadth = scan.nextInt();
          side = scan.nextInt();
          radius = scan.nextInt();
          Area a = new Area();
          a.rectangleArea(length, breadth);
          a.squareArea(side);
          a.circleArea(radius);

          scan.close();
     }
}