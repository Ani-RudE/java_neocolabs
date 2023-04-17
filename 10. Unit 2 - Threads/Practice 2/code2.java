//Write a program to implement multithreading that extends the Object class
// class multithreading implements runnable
import java.util.*;

class MultithreadingTest implements Runnable {
     public void run() {
          try {
               // Displaying the running Thread
               System.out.println(
                         "Thread " + Thread.currentThread().getId() + " is running");
          } catch (Exception e) {
               // exception is caught if occurred
               System.out.println("Exception has occurred and is caught");
          }
     }
}

class Main {
     public static void main(String[] args) {
          // int n = 6;// Number of threads

          Scanner scan = new Scanner(System.in);
          int n = Integer.parseInt(scan.nextLine());
          for (int i = 0; i < n; i++) {
               Thread obj = new Thread(new MultithreadingTest());
               obj.start();
          }

          scan.close();
     }
}
