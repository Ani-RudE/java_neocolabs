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