import java.util.*;

class Main{
    public static void main(String[] args)
    {
        int a;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        int x=6;
        System.out.print(x+" ");
        
        for (int i=1; i<a; i++)
        {
            x=x+(i*5);
            System.out.print(x+" ");
        }
        
        scan.close();
    }
}