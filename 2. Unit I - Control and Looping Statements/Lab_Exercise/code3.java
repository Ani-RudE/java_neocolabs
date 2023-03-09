//Stairs and Elevators.
import java.util.*;

class hello{
     public static void main(String [] args)
     {
          int n,v1,v2;
          double t1,t2;
          Scanner scan = new Scanner(System.in);
          n = scan.nextInt();
          v1 = scan.nextInt();
          v2 = scan.nextInt();

          t1=1.41421356237*n*100/v1;
          t2=2*n*100;
          t2=t2/v2;

          if(t1<t2)
          {
               System.out.println("Stairs");
          }
          else
          {
               System.out.println("Elevator");
          }

          scan.close();
     }    
}