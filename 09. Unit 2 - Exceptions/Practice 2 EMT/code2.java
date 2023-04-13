import java.util.*;

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          try {
               String str = null;
               int index = Integer.parseInt(scan.nextLine());
               System.out.println(str);
               System.out.println(str.charAt(index));
          } catch (NullPointerException n) {
               System.out.println(n);
          }

          scan.close();
     }
}