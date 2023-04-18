//Helen is having
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
          int max = arList.stream()
               .max(Integer::compare)
               .get();
          System.out.println(max);

          scan.close();
     }
}