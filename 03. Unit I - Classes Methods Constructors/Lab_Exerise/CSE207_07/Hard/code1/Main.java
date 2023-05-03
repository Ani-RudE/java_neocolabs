import java.util.Scanner;

public class Main {
     /** Main method */
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int speed = in.nextInt();
          int rad = in.nextInt();
          boolean onof = in.nextBoolean();
          String color = in.nextLine();

          final int SLOW = 1; // Fan speed slow
          final int MEDIUM = 2; // Fan speed medium
          final int FAST = 3; // Fan speed fast
          // Create two Fan objects
          Fan fan1 = new Fan();
          // Assign maximum speed, radius 10, color yellow,
          // and turn it on to the first object
          fan1.setSpeed(speed);
          fan1.setRadius(rad);
          fan1.setColor(color);
          fan1.turnOnOff(onof);
          // Display the objects by invoking their toString method
          System.out.println(fan1.toString());
     }
}





//Fan.java
public class Fan {
     final static int SLOW = 1;
     final static int MEDIUM = 2;
     final static int FAST = 3;
     private int speed;
     private boolean on;
     private double radius;
     String color;

     /** Constructor that creates a default fan */
     Fan() {
          speed = SLOW;
          on = false;
          radius = 5;
          color = "blue";
     }

     /** Mutator methods */
     /** Sets speed */
     public void setSpeed(int newSpeed) {
          speed = newSpeed;
     }

     /** Sets fan on/off */
     public void turnOnOff(boolean onoff) {
          on = onoff;
     }

     /** Sets color */
     public void setColor(String newColor) {
          color = newColor;
     }

     /** Sets radius */
     public void setRadius(double newRadius) {
          radius = newRadius;
     }

     /** Accessor methods */
     /** Return speed */
     public String getSpeed() {
          String s = "";
          switch (speed) {
               case SLOW:
                    s = "SLOW";
                    break;
               case MEDIUM:
                    s = "MEDIUM";
                    break;
               case FAST:
                    s = "FAST";
          }
          return s;
     }

     /** Return on */
     public boolean isOn() {
          return on;
     }

     /** Return radius */
     public double getRadius() {
          return radius;
     }

     /** Return color */
     public String getColor() {
          return color;
     }

     /** Returns a string description for the fan */
     public String toString() {
          if (on == true) {
               return "Fan speed: " + getSpeed() + ", color: " + color +
                         ", radius: " + radius + "\n";
          } else {
               return "Fan color: " + color + ", radius: " + radius +
                         "\nfan is off\n";
          }
     }
}