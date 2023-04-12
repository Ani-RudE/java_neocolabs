//Marks and Grades
import java.util.*;

class Main{
     public static void main(String args[])
     {
          int mark;
          Scanner scan =new Scanner(System.in);
          mark=scan.nextInt();
          
          if(mark>=85)
          {
               System.out.print("A");
          }
          else if(mark>=75)
          {
               System.out.print("B");
          }
          else if(mark>=65)
          {
               System.out.print("C");
          }
          else if(mark>=0)
          {
               System.out.print("D");
          }
          else
          {
               System.out.print("Invalid");
          }

          scan.close();
     }
}