//Define an Interface Growing
import java.util.*;
import java.util.Arrays;

interface Growing{
void isGrowing();
}

class GrowingNumber implements Growing {
     int num;

     public GrowingNumber(int i) {
          num = i;
     }

     public void isGrowing() {
          // int num=423;
          boolean flag = false;
          int currentDigit = num % 10;
          num = num / 10;
          while (num > 0) {
               if (currentDigit <= num % 10) {
                    flag = true;
                    break;
               }
               currentDigit = num % 10;
               num = num / 10;
          }
          if (flag) {
               System.out.println("Not growing number");
          } else {
               System.out.println("Growing number");
          }
     }
}

class GrowingString implements Growing {
     String s1;

     public GrowingString(String string) {
          s1 = string;
     }

     public void isGrowing() {
          int n = s1.length();
          char c[] = new char[n];

          for (int i = 0; i < n; i++) {
               c[i] = s1.charAt(i);
          }
          Arrays.sort(c);
          boolean flag = true;
          for (int i = 0; i < n; i++)
               if (c[i] != s1.charAt(i))
                    flag = false;

          if (flag) {
               System.out.println("Growing string");
          } else {
               System.out.println("Not growing string");
          }
     }
}

class Main {
     public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
          int i = scan.nextInt();
          String str = scan.nextLine();
          // System.out.println(i + str);
          GrowingNumber x = new GrowingNumber(i);
          GrowingString s = new GrowingString(str);
          x.isGrowing();
          // System.out.println(str);
          s.isGrowing();

          scan.close();
     }
}