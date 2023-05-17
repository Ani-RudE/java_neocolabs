//HashSet
import java.util.*;
import java.io.*;

class Main {
     public static void main(String[] args) {
          int i, n;
          Scanner sc = new Scanner(System.in);
          n = Integer.parseInt(sc.nextLine());
          Set<String> hs = new HashSet<>(n);
          for (i = 0; i < n; i++) {
               hs.add(sc.nextLine());
          }
          String hsName = sc.nextLine();

          if (hs.contains(hsName)) {
               System.out.println(hsName + " is in the hash set.");
          } else {
               System.out.println(hsName + " is not in the hash set.");
          }
     }
}