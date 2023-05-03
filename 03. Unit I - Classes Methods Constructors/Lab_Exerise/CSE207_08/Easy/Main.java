import java.util.Scanner;

public class Main {
     /** Main method */
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          double x1 = in.nextDouble();
          double y1 = in.nextDouble();
          double x2 = in.nextDouble();
          double y2 = in.nextDouble();
          // Create two points
          MyPoint point1 = new MyPoint(x1, y1);
          MyPoint point2 = new MyPoint(x2, y2);
          // Display the distance between point1 and point2
          System.out.println("The distance between ("
                    + point1.getX() + ", " + point1.getY() + ") and ("
                    + point2.getX() + ", " + point2.getY() + ") is: " +
                    point1.distance(point2));
     }
}





//MyPoint.java
public class MyPoint {
     // Data fields
     private double x;
     private double y;

     /** Constructor that creates a point (0, 0) */
     MyPoint() {
          this(0, 0);
     }

     /** Constructs a point with specified coordinates */
     MyPoint(double x, double y) {
          this.x = x;
          this.y = y;
     }

     /** Return x */
     public double getX() {
          return x;
     }

     /** Return y */
     public double getY() {
          return y;
     }

     /**
      * Returns the distance from this point to
      * a specified point of the MyPoint type
      */
     public double distance(MyPoint myPoint) {
          return (double) Math.round(Math.sqrt(Math.pow(myPoint.getX() - x, 2) +
                    Math.pow(myPoint.getY() - y, 2)) * 100) / 100;
     }

     /**
      * Returns the distance from this point to another
      * point with specified x- and y-coordinates.
      */
     public double distance(double x, double y) {
          return distance(new MyPoint(x, y));
     }
}