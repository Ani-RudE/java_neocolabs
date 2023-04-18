//Given a list of integers
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
          long count = arList.stream()
                    .count();
          System.out.println(count);

          scan.close();
     }
}