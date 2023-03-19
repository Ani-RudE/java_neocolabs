//Program to move all the Uppercase Characters to the end of the string.
import java.util.*;

interface Case{
 String move(String s);
}

class Main implements Case {

     public String move(String str) {
          int len = str.length();
          String low = "";
          String upr = "";
          char ch;
          for (int i = 0; i < len; i++) {
               ch = str.charAt(i);
               if (ch >= 'A' && ch <= 'Z') {
                    upr += ch;
               } else {
                    low += ch;
               }
          }
          return low + upr;
     }

     public static void main(String args[]) {
          String str;
          Scanner scan = new Scanner(System.in);
          str = scan.nextLine();
          Main obj = new Main();
          obj.move(str);
          System.out.println(obj.move(str));

          scan.close();
     }
}