//Write a program that starts two threads marked "even" and "odd"
import java.util.concurrent.*;

class Q01Complex_Thread {
     private static final Object objectToSync = new Object();
     static CyclicBarrier barrier = new CyclicBarrier(2);

     public static class MyRunnable implements Runnable {
          private boolean printEven;

          public MyRunnable(boolean b) {
               this.printEven = b;
          }

          public void run() {
               try {
                    for (int i = 1; i < 21; i++) {
                         if (printEven && i % 2 == 0)
                              System.out.println("Thread even:" + i);
                         else if (!printEven && i % 2 == 1)
                              System.out.println("Thread Odd:" + i);
                         barrier.await();
                    }
               } catch (BrokenBarrierException e) {
               } catch (InterruptedException e) {
               }
          }
     }

     public static void main(String[] args) throws java.lang.Exception {
          Thread tEven = new Thread(new MyRunnable(true));
          tEven.start();
          Thread tOdd = new Thread(new MyRunnable(false));
          tOdd.start();
     }
}
