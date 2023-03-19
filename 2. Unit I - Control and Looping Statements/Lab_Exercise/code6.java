//Second Last and Third Last.
import java.util.*;

class Main{
     public static void main(String[] args)
     {
          int num;
          Scanner scan= new Scanner(System.in);
          num=scan.nextInt();

          int thirdLast = 0;
          int secondLast = 0;
          int last = 1;
          int current = 0;
          scan.close();

          System.out.print(thirdLast + " " + secondLast + " " + last + " ");
          for (int i = 3; i < num; i++)
          {
               current = last + secondLast + thirdLast;
               System.out.print(current + " ");
               int temp = last;
               last = current;
               thirdLast = secondLast;
               secondLast = temp;
          }
     }
}