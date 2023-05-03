import java.util.Scanner;

public class Main {
     /** Main method */
     public static void main(String[] args) {
          // Create a Scanner object
          Scanner input = new Scanner(System.in);
          // Prompt the user to enter a two-dimensional array
          // System.out.print("Enter the number of rows and columns in the array: ");
          int rows = input.nextInt();
          int columns = input.nextInt();
          // Create a matrix
          double[][] array = new double[rows][columns];
          // System.out.println("Enter the array: ");
          for (int i = 0; i < array.length; i++) {
               for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = input.nextDouble();
               }
          }
          // Get and instance of Loacation
          Location max = locateLargest(array);
          // Display the location of the largest element in the array
          System.out.println(
                    "The location of the largest element is " + max.maxValue + "at (" + max.row + " , " + max.column);
     }

     /* locateLargest returns an instance of Location */
     public static Location locateLargest(double[][] a) {
          return new Location(a);
     }
}



//Location.java
public class Location {
     // Data fields
     int row; // Row index of maximal value
     int column; // Column index of maximal value
     double maxValue; // Maximal value

     /** Constructs a default Loction object */
     Location(double[][] a) {
          maxValue = a[0][0];
          row = 0;
          column = 0;
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] > maxValue) {
                         maxValue = a[i][j];
                         row = i;
                         column = j;
                    }
               }
          }
     }
}