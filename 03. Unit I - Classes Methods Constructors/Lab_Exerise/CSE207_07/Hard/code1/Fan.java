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