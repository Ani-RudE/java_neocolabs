// Expenses of a company
import java.util.*

public class code3 {
     public static void main(String[] args)
     {
          double brand, travel, food, logi, total;

          Scanner scan=new Scanner(System.in);

          brand=scan.nextDouble();
          travel=scan.nextDouble();
          food=scan.nextDouble();
          logi=scan.nextDouble();
          total=brand+travel+food+logi;
          brand=brand*100/total;
          travel=travel*100/total;
          food=food*100/total;
          logi=logi*100/total;

          System.out.print("Total expenses : Rs.");
          System.out.printf("%.2f", total);
          System.out.println();
          System.out.printf("Branding expenses percentage : %.2f", brand);
          System.out.print("%");
          System.out.println();
          System.out.printf("Travel expenses percentage : %.2f", travel);
          System.out.print("%");
          System.out.println();
          System.out.printf("Food expenses percentage : %.2f", food);
          System.out.print("%");
          System.out.println();
          System.out.printf("Logistics expenses percentage : %.2f", logi);
          System.out.print("%");

          scan.close();
     }
}