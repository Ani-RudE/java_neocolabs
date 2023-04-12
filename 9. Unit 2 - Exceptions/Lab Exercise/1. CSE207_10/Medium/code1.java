//Write a program that meets the following requirements - Creates and array with 100 elements
import java.util.*;

class Main {
     public static void main(String[] args) {
          // Create a Scanner
          Scanner scan = new Scanner(System.in);
          // Invoke getArray method
          int[] array = getArray();
          // Prompt the user to enter the index of the array
          try {
               // Display the corresponding element value
               System.out.println("The corresponding element value is "
                         +
                         array[scan.nextInt()]);
          } catch (ArrayIndexOutOfBoundsException ex) {
               System.out.println("Out of Bounds.");
          }

          scan.close();
     }

     /** Returns an array with 100 randomly chosen integers */
     public static int[] getArray() {
          int[] array = new int[100];  
          for (int i = 0; i < array.length; i++) {
               array[i] = i;
          }
          return array;
     }
}