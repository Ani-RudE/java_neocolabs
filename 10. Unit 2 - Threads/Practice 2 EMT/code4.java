//Write a program to implement multithreading using the join(), isAlive() and sleep() methods
import java.util.*;

class A implements Runnable {
     String name;
     Thread t;

     A(String tname) {
          name = tname;
          t = new Thread(this, name);
          t.start();
     }

     public void run() {
          try {
               Scanner scan = new Scanner(System.in);
               int n = Integer.parseInt(scan.nextLine());
               for (int i = 1; i <= n; i++) {
                    System.out.println(name + " = " + i);
                    Thread.sleep(300);
               }
               System.out.println("END OF = " + name);

               scan.close();
          } catch (Exception e) {
          }
     }
}

class Main {
     public static void main(String args[]) {
          A nt1 = new A("Thread");
          System.out.println("Thread is alive :: " + nt1.t.isAlive());
          try {
               nt1.t.join();
          } catch (Exception e) {
          }
          System.out.println("Thread is alive = " + nt1.t.isAlive());
          System.out.println("End of main.");
     }
}