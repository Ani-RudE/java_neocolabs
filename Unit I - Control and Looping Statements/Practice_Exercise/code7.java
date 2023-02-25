import java.util.*;

class Main{
    public static void main(String[] args)
    {
        
        int num;
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        int sum=0;
            
        while (num>0 || sum>9)
        {
            if (num==0)
            {
                num=sum;
                sum=0;
            }
            
            sum+=num%10;
            num/=10;
        }

        System.out.println(sum);
        
        scan.close();
    }
}