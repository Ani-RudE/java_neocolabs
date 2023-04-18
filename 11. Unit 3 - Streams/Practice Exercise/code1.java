//Einstein is trying
import java.util.Scanner;

class Main {
     public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
          String str = scan.nextLine();
          char c = scan.next().charAt(0);
          Long l = str.chars()
               .filter(val -> val == c)
               .count();
          System.out.println(l);

          scan.close();
     }
}