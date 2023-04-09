//You are building a 3D modelling software that can calculate the volume of various shapes
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