import java.util.Scanner;

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
          Scanner in = new Scanner(System.in);
          str = in.nextLine();
          Main obj = new Main();
          obj.move(str);
          System.out.println(obj.move(str));
     }
}