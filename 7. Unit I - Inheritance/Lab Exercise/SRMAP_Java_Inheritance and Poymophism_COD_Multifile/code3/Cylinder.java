// Cylinder.java
public class Cylinder extends Circle {
     protected double height;
     protected double volume;

     public Cylinder(double radius, double height) {
          super(radius);
          this.height = height;
     }

     public void calculateVolume() {
          super.calculateArea();
          volume = getArea() * height;
          System.out.println("Volume of cylinder: " + volume);
     }
}