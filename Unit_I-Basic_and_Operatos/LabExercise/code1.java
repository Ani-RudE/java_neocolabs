// Write a prog. to find square, cube and square root.
import java.util.*;
import java.lang.Math;

class Code1{
     public static void main(String[] args)
     {
          int n;
          Scanner scan = new Scanner(System.in);
          n=scan.nextInt();
          
          System.out.print("Square of "+n+" is: "+Math.pow(n, 2)+"\n");
          System.out.print("Cube of "+n+" is: "+Math.pow(n, 3)+"\n");
          System.out.print("Square Root of "+n+" is: "+Math.pow(n, 0.5)+"\n");
          
          scan.close();
     }
}