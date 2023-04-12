//Area of shape
import java.text.DecimalFormat;
import java.util.*;

class Shape {
     protected double area;

     public void computeArea() {
          area = 0;
     }

     public double getArea() {
          return area;
     }

     public void setArea(double area) {
          this.area = area;
     }
}

class Circle extends Shape {
     private double radius;

     public double getRadius() {
          return radius;
     }

     public void setRadius(double radius) {
          this.radius = radius;
     }

     public void computeArea() {
          DecimalFormat d = new DecimalFormat("0.00");
          this.area = 3.14 * (radius * radius);
          System.out.println(d.format(this.area));
     }
}

class Rectangle extends Shape {
     private double length;
     private double breadth;

     public double getLength() {
          return length;
     }

     public void setLength(double length) {
          this.length = length;
     }

     public double getBreadth() {
          return breadth;
     }

     public void setBreadth(double breadth) {
          this.breadth = breadth;
     }

     public void computeArea() {
          DecimalFormat d = new DecimalFormat("0.00");
          this.area = length * breadth;
          System.out.println(d.format(this.area));
     }
}

class Triangle extends Shape {
     private double base;
     private double height;

     public double getBase() {
          return base;
     }

     public void setBase(double base) {
          this.base = base;
     }

     public double getHeight() {
          return height;
     }

     public void setHeight(double height) {
          this.height = height;
     }

     public void computeArea() {
          DecimalFormat d = new DecimalFormat("0.00");
          this.area = 0.5 * base * height;
          System.out.println(d.format(this.area));
     }
}

class Main {
     public static void main(String[] args) {
          int n;
          Scanner scan = new Scanner(System.in);
          n = scan.nextInt();
          Circle c = new Circle();
          Rectangle r = new Rectangle();
          Triangle t = new Triangle();
          if (n == 1) {
               c.setRadius(scan.nextDouble());
               c.computeArea();
          }
          if (n == 2) {
               r.setLength(scan.nextDouble());
               r.setBreadth(scan.nextDouble());
               r.computeArea();
          }
          if (n == 3) {
               t.setBase(scan.nextDouble());
               t.setHeight(scan.nextDouble());
               t.computeArea();
          }
          if (n > 3) {
               System.out.println("Invalid Input");
          }

          scan.close();
     }
}