import java.util.*

class hello{
     public static void main(String args[])
     {
          int N;
          Scanner scan=new Scanner(System.in);
          N=scan.nextInt();
          int i=0;

          i=i+(N/100);
          N=N%100;

          i=i+(N/50);
          N=N%50;

          i=i+(N/10);
          N=N%10;

          i=i+(N/5);
          N=N%5;

          i=i+(N/2);
          N=N%2;

          i=i+N;

          System.out.println(i);

          scan.close();
     }
}