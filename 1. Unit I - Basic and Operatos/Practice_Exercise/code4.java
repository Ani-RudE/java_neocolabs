//Change Position
import java.util.*

class code4 {
     public static void main(String args[]) {
          int x, y, l;

          Scanner s = new Scanner(System.in);

          x = s.nextInt();
          y = s.nextInt();
          l = s.nextInt();

          x = x + (l / 2);
          y = y + (l / 2);
          System.out.println(x + " " + y);

          s.close();
     }
}