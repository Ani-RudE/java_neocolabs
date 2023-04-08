import java.util.*;

public class Main{
     public static void main(String[] args)
     {
          // Create a new Adder object
          Scanner scan = new Scanner(System.in);
          int x1 = scan.nextInt();
          int y1 = scan.nextInt();
          int x2 = scan.nextInt();
          int y2 = scan.nextInt();
          Adder obj = new Adder();

          // Print the name of the superclass on a new line
          System.out.println("My superclass is: " +
                    obj.getClass().getSuperclass().getName());

          // Print the result of 3 calls to Adder's `add(int,int)` method as 3
          // spaceseparated integers:
          System.out.print(obj.add(x1, y1) + " " + obj.callAdd(x2, y2) + "\n");

          scan.close();
     }
}