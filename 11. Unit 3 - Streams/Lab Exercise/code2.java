//Athiyan is having a list
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
     public static void main(String[] args) {
          List<Integer> arList = new ArrayList<Integer>();
          Scanner scan = new Scanner(System.in);
          int num = scan.nextInt();
          for (int i = 0; i < num; i++) {
               arList.add(scan.nextInt());
          }
          arList.stream()
               .map(s -> s + "") // Convert integer to String
               .filter(s -> s.startsWith("1"))
               .forEach(System.out::println);

          scan.close();
     }
}