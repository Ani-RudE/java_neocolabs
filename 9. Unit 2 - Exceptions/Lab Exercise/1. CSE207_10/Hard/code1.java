//Defined a Triangle class with three sides
import java.util.*;

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          double s1 = scan.nextDouble();
          double s2 = scan.nextDouble();
          double s3 = scan.nextDouble();
          try
          {
               TriangleWithException t1 = new TriangleWithException(s1,
                         s2, s3);
               System.out.println("Perimeter " + t1.getPerimeter());
          }
          catch (IllegalTriangleException ex)
          {
               System.out.println("Illegal triangle");
               System.out.println("Side1: " + ex.getSide1());
               System.out.println("Side2: " + ex.getSide2());
               System.out.println("Side3: " + ex.getSide3());
          }

          scan.close();
     }
}

class TriangleWithException {
     double side1, side2, side3;

     /** Constructor */
     public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException
     {
          if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
               throw new IllegalTriangleException(side1, side2, side3);
          
          this.side1 = side1;
          this.side2 = side2;
          this.side3 = side3;
     }

     /** Implement the abstract method findArea scan GeometricObject */
     public double getArea()
     {
          double s = (side1 + side2 + side3) / 2;
          return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
     }

     /**
      * Implement the abstract method findCircumference scan
      * GeometricObject
      **/
     public double getPerimeter()
     {
          return side1 + side2 + side3;
     }

     @Override
     public String toString()
     {
          // Implement it to return the three sides
          return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
     }
}

class IllegalTriangleException extends Exception {
     private double side1, side2, side3;

     public IllegalTriangleException(double side1, double side2, double side3)
     {
          super("Illegal sides " + side1 + " " + side2 + " " + side3);
          
          this.side1 = side1;
          this.side2 = side2;
          this.side3 = side3;
     }

     /** Return side1 */
     public double getSide1() {
          return side1;
     }

     /** Return side2 */
     public double getSide2() {
          return side2;
     }

     /** Return side3 */
     public double getSide3() {
          return side3;
     }
}