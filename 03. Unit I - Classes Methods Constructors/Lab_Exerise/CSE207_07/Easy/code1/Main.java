public class Main {
     /** Main method */
     public static void main(String[] args) {
          // Create a Rectangle with width 4 and height 40
          Rectangle rectangle1 = new Rectangle(4, 40);
          // Create a Rectangle with width 3.5 and height 35.9
          Rectangle rectangle2 = new Rectangle(3, 35);
          Rectangle rectangle3 = new Rectangle();

          // Display the width, height, area, and perimeter of rectangle1
          System.out.println("\n Rectangle()");
          System.out.println("-------------");
          System.out.println("Width: " + rectangle3.width);
          System.out.println("Height: " + rectangle3.height);
          System.out.println("Area: " + rectangle3.getArea());
          System.out.println("Perimeter: " + rectangle3.getPerimeter());
          // Display the width, height, area, and perimeter of rectangle1
          System.out.println("\n Rectangle(4, 40)");
          System.out.println("-------------");
          System.out.println("Width: " + rectangle1.width);
          System.out.println("Height: " + rectangle1.height);
          System.out.println("Area: " + rectangle1.getArea());
          System.out.println("Perimeter: " + rectangle1.getPerimeter());
          // Display the width, height, area, and perimeter of rectangle2
          System.out.println("\n Rectangle(3, 35)");
          System.out.println("-------------");
          System.out.println("Width: " + rectangle2.width);
          System.out.println("Height: " + rectangle2.height);
          System.out.println("Area: " + rectangle2.getArea());
          System.out.println("Perimeter: " + rectangle2.getPerimeter());
     }
}