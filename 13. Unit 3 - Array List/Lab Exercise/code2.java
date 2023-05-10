import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayListMain {
     public static void main(String args[]) {
          List<String> names = new ArrayList<>();
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.nextLine());
          for (int i = 0; i < n; i++)
               names.add(sc.nextLine());

          Iterator it = names.iterator();

          while (it.hasNext()) {
               System.out.println(it.next());
          }
     }
}