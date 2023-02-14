import java.util.*;

class demo {
   public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);

      for (int i = 0; i < args.length; i++)
      {  
         args[i]=scan.next();
         System.out.print(args[i]+" ");
      }
      
      System.out.println();

      scan.close();
   }
}