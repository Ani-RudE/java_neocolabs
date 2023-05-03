//Rectangle.java
public class Rectangle {
     double width; // Width of rectangle
     double height; // Height of rectangle

     /** A no-arg constructor that creates a default rectangle */
     Rectangle() {
          width = 1;
          height = 1;
     }

     /**
      * A constructor that creates a rectangle
      * with the specified width and height
      */
     Rectangle(double newWidth, double newHeight) {
          width = newWidth;
          height = newHeight;
     }

     /** Return the area of this rectangle */
     double getArea() {
          return width * height;
     }

     /** Return the perimeter of this rectangle */
     double getPerimeter() {
          return 2 * (width + height);
     }
}