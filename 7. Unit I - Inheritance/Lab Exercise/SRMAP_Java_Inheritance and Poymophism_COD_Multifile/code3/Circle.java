//Circle.java
public class Circle extends Shape {
     protected double radius;

     public Circle(double radius) {
          this.radius = radius;
     }

     public void calculateArea() {
          area = Math.PI * radius * radius;
          System.out.println("Area of circle: " + area);
     }
}