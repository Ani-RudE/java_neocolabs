package Unit_1.Basic_and_Operatos.LabExercise;
import java.util.*;

public class code2 {
     public static void main(String[] args)
     {
          float A, B, C;

          Scanner scan=new Scanner(System.in);

          A=scan.nextFloat();
          B=scan.nextFloat();
          C=scan.nextFloat();

          float profit=(C-(A+B))*100/C;

          System.out.print(String.format("%.2f", profit));

          scan.close();
     }
}