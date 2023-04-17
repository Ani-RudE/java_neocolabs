//Suspend and resume
import java.util.*;

class Resource {
     int n = -1;
     boolean flag = true;

     synchronized void produce(int a) {
          while (!flag) {
               try {
                    wait();
               } catch (InterruptedException e) {
               }
          }
          n = a;
          System.out.println(" Producer ::: " + n);
          flag = false;
          notify();
     }

     synchronized int consume() {
          while (flag) {
               try {
                    wait();
               } catch (InterruptedException e) {
               }
          }
          flag = true;
          notify();
          System.out.println(" Consumer ::: " + n);
          return n;
     }
}

class Producer implements Runnable {
     Resource s;
     Thread t;

     Producer(Resource r) {
          s = r;
          t = new Thread(this, "Producer");
          t.start();
     }

     public void run() {
          Scanner scan = new Scanner(System.in);
          int n = Integer.parseInt(scan.nextLine());
          for (int i = 1; i <= n; i++) {
               try {
                    Thread.sleep(300);
               } catch (InterruptedException e) {
               }
               s.produce(i);
          }
          System.out.println(" Producer Terminating. ");

          scan.close();
     }
}

class Consumer implements Runnable {
     Resource s;
     Thread t;

     Consumer(Resource r) {
          s = r;
          t = new Thread(this, "Consumer");
          t.start();
     }

     public void run() {
          int i;
          do {
               try {
                    Thread.sleep(300);
               } catch (InterruptedException e) {
               }
               i = s.consume();
          } while (i != 1000);
          System.out.println("Consumer Terminating. ");
     }
}

class Main {
     public static void main(String args[]) {
          Resource r = new Resource();
          new Producer(r);
          new Consumer(r);
     }
}