// Profit and Loss of scooter
import java.util.*;

class Main{
     public static void main(String[] args)
     {
          float A, B, C;

          Scanner scan=new Scanner(System.in);

          A=scan.nextFloat();
          B=scan.nextFloat();
          C=scan.nextFloat();

          float profit=((C-(A+B))*100)/(A+B);

          System.out.print(String.format("%.2f", profit));

          scan.close();
     }
}