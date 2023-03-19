import java.util.*
// import java.lang.Math.*;

class Main{
     public static void main(String[] args)
     {
          double d;
          Scanner scan=new Scanner(System.in);
          d=scan.nextDouble();
          double s, l, b;
          
          s=(3*d)/Math.sqrt(3);
          l=3*s;
          b=4*d;
          
          System.out.printf("Side : %.2f\n", s);
          System.out.printf("Length : %.2f\n", l);
          System.out.printf("Breadth : %.2f\n", b);

          scan.close();
     }
}