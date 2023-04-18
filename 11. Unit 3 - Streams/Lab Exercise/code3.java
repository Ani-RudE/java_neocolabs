//Gokul is given a list
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
     public static void main(String args[]) {
          List<Integer> arList = new ArrayList<Integer>();
          Scanner scan = new Scanner(System.in);
          int num = scan.nextInt();
          for (int i = 0; i < num; i++) {
               arList.add(scan.nextInt());
          }
          arList.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

          scan.close();
     }
}