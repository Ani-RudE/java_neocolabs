import java.util.*;

//java synchronized method
class Table {
     synchronized void printTable(int n) {// synchronized method
          for (int i = 1; i <= 5; i++) {
               System.out.println(n * i);
               try {
                    Thread.sleep(30);
               } catch (Exception e) {
                    System.out.println(e);
               }
          }
     }
}

public class Main {
     public static void main(String args[]) {
          Table obj = new Table();// only one object
          Scanner in = new Scanner(System.in);
          int a = in.nextInt();
          int b = in.nextInt();
          MyThread1 t1 = new MyThread1(obj, a);
          MyThread2 t2 = new MyThread2(obj, b);
          t1.start();
          t2.start();
          in.close();
     }
}

class MyThread1 extends Thread {
     Table t;
     int n;

     MyThread1(Table t, int n) {
          this.t = t;
          this.n = n;
     }

     public void run() {
          t.printTable(n);
     }
}

class MyThread2 extends Thread {
     Table t;
     int n;

     MyThread2(Table t, int n) {
          this.t = t;
          this.n = n;
     }

     public void run() {
          t.printTable(n);
     }
}