//Write a Java Program that prompts the suer to input an integer value between 1 and 10
//RangeChecker.java
public class RangeChecker {
     public static void checkInRange(int num) throws OutOfRangeException {
          if (num < 1 || num > 10) {
               throw new OutOfRangeException();
          }
     }
}

class OutOfRangeException extends Exception {
     public OutOfRangeException() {
          super("Number is out of range");
     }
}