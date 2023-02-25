import java.util.*;

class Main{
    public static void main(String[] args)
    {
        int n, m;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        
        for (int i=n; i<=m; i++)
        {
            int a, b;
            a=i%10;
            b=i/10;
            
            if (i==(a+b)+(a*b))
            {
                System.out.println(i);
            }
        }
        
        scan.close();
    }
}