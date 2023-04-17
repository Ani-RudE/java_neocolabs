
//Your English literature friend is very happy
import java.util.Scanner;

class Mythread extends Thread {
     String str;
     static int n;

     public Mythread(String str) {
          super();
          this.str = str;
     }

     public void run() {
          n = this.str.length();
          int[] freq = new int[26];
          for (int i = 0; i < n; i++)
               freq[this.str.charAt(i) - 'a']++;

          for (int i = 0; i < n; i++) {
               if (freq[this.str.charAt(i) - 'a'] != 0) {
                    System.out.print(this.str.charAt(i));
                    System.out.print(freq[this.str.charAt(i) - 'a']);
                    System.out.println();
                    freq[this.str.charAt(i) - 'a'] = 0;
               }
          }
     }
}

class MainThread {
     public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
          int n = Integer.parseInt(scan.nextLine());
          for (int i = 0; i < n; i++) {
               String str = scan.nextLine();
               Mythread t2 = new Mythread(str);
               t2.start();
               System.out.println();
          }
     }
}