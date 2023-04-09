//You are building a 3D modelling software that can calculate the volume of various shapes
//Main.java
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          // System.out.print("Enter the length of the rectangle: ");
          double length = scan.nextDouble();
          // System.out.print("Enter the width of the rectangle: ");
          // double width = scanner.nextDouble();
          // System.out.print("Enter the radius of the circle: ");
          double radius = scan.nextDouble();
          Cylinder cylinder = new Cylinder(radius, length);
          cylinder.calculateVolume();

          scan.close();
     }
}