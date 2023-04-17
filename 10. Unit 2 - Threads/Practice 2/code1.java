//Multithreading Factorial
import java.util.*;

class Multiple implements Runnable {
     int n;

     public Multiple(int n) {
          this.n = n;
     }

     public void run() {
          for (int i = 1; i <= n; i++) {
               if (i == (int) (n / 2)) {
                    try {
                         Thread.sleep(1000);
                    } catch (Exception e) {
                    }
               }
               int c;
               c = Multiple(n, i);
               if (c == 0)
                    System.out.println(n + " is divisible by " + i);
          }
     }

     public int Multiple(int n, int i) {
          if (n % i == 0)
               return 0;
          else
               return 1;
     }
}

class Fact implements Runnable {
     int n;

     public Fact(int n) {
          this.n = n;
     }

     public void run() {
          for (int i = 1; i <= n; i++) {
               System.out.println("Factorial : " + i + "! = " + fact(i));
               try {
                    Thread.sleep(1000);
               } catch (Exception e) {
               }
          }
     }

     public int fact(int n) {
          if (n == 1)
               return 1;
          else
               return (fact(n - 1) * n);
     }
}

class Main {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          Thread T1 = new Thread(new Multiple(sc.nextInt()));
          Thread T2 = new Thread(new Fact(sc.nextInt()));
          T1.start();
          T2.start();
     }
}