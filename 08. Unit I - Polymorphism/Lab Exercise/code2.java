//Function Overloading - Write a program to implement function overloading. Ram is given two or three inputs
import java.util.*;

class Main {
     public int fun1(int a,int b)
     {
          return a+b;
     }

     public int fun1(int a,int b,int c)
     {
          return a+b+c;
     }

     public static void main(String args[])
     {
          Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
          int[] arr = new int[a];
          for (int i = 0; i < a; i++)
          {
               arr[i] = scan.nextInt();
          }
          Main m = new Main();
          if (a==1)
               System.out.println(arr[0]);
          else if (a==2)
               System.out.println(m.fun1(arr[0], arr[1]));
          else if (a==3)
               System.out.println(m.fun1(arr[0], arr[1], arr[2]));
          else
               System.out.println("WRONG INPUT");

          scan.close();
     }
}