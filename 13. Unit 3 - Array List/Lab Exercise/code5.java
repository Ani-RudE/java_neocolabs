//contains()
import java.io.*;
import java.util.*;

class Main {
     public static void main(String[] args) {
          int i, n;
          Scanner sc = new Scanner(System.in);
          n = Integer.parseInt(sc.nextLine());
          ArrayList<String> hall = new ArrayList<>(n);
          for (i = 0; i < n; i++) {
               hall.add(sc.nextLine());
          }
          String search = sc.nextLine();
          if (hall.contains(search)) {
               System.out.println(hall.indexOf(search));
          } else {
               System.out.println(search + " hall is not found");
          }
     }
}