//Leap Year.
import java.util.*

class Main{
    public static void main(String[] args)
    {
        int a, k=0;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        
        if(a%4==0)
        {
            if (a%100==0)
            {
                if (a%400==0)
                {
                    k=1;
                }
            }
            else
            {
                k=1;
            }
        }
        
        if (k==1)
        {
            System.out.println(a+" Leap year");
        }
        else
        {
            System.out.println(a+" Not leap year");
        }
        
        scan.close();
     }
}