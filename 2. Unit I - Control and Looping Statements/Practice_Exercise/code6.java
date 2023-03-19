//Drona and Arjuna, scoring 100 points.
import java.util.*;

class Main{
    public static void main(String[] args)
    {
        int n, x=0, z=0;
        Scanner scan=new Scanner(System.in);
        int y;
        n=scan.nextInt();
        
        while (true)
        {
            y=scan.nextInt();
            x=x+y;
            z+=1;
            
            if (x>=n)
            {
                System.out.println("The number of turns is "+z);
                break;
            }
        }
        
        scan.close();
    }
}