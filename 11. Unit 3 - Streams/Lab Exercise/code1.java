//Sakthivel is supposed to filter out
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
     public static void main (String[] args)
     {
          List<String> arList = new ArrayList<String>();
          Scanner scan = new Scanner(System.in);

          int num = scan.nextInt();
          for (int i = 0; i < num; i++) 
          {
               arList.add(scan.next());
          }
          int n = scan.nextInt();
          int ans = arList.stream()
               .filter(s -> s.length() > n)
               .mapToInt(s -> s.length())
               .sum();
          System.out.println(ans);

          scan.close();
     }
}