//Special Number.
import java.util.*

class Main{
    public static void main(String args[])
    {
        int C, D, L;
        Scanner scan=new Scanner(System.in);
        C=scan.nextInt();
        D=scan.nextInt();
        L=scan.nextInt();
        
        if (L==((C*2)+(D*2)))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        scan.close();
    }
}