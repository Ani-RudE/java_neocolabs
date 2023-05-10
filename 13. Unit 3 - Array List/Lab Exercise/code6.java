import java.io.*;
import java.util.*;

class Main {
     public static void main(String[] args) {
          int n, i;
          Scanner sc = new Scanner(System.in);
          n = Integer.parseInt(sc.nextLine());
          ArrayList<String> arrlist = new ArrayList<String>(n);
          for (i = 0; i < n; i++) {
               arrlist.add(sc.nextLine());
          }
          System.out.println(arrlist);
     }
}