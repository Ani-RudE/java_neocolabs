//Vikram is to find duplicate elements
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Main {
     public static void main(String args[]) {
          List<Integer> arList = new ArrayList<Integer>();
          Set<Integer> set = new HashSet<Integer>();
          Scanner scan = new Scanner(System.in);
          int num = scan.nextInt();
          for (int i = 0; i < num; i++) {
               arList.add(scan.nextInt());
          }
          arList.stream()
               .filter(n -> !set.add(n))
               .forEach(System.out::println);

          scan.close();
     }
}