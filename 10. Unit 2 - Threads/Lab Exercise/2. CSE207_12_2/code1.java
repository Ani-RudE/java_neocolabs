//Complete the code snippet
class Main {
     public static void main(String args[]) {
          Table obj = new Table();// only one object
          MyThread1 t1 = new MyThread1(obj);
          MyThread2 t2 = new MyThread2(obj);
          t1.start();
          t2.start();
     }
}

class Table {
     void printTable(int n) {// synchronized method
          synchronized (this) {
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
}

class MyThread1 extends Thread {
     Table t;

     MyThread1(Table t) {
          this.t = t;
     }

     public void run() {
          t.printTable(11);
     }
}

class MyThread2 extends Thread {
     Table t;

     MyThread2(Table t) {
          this.t = t;
     }

     public void run() {
          t.printTable(101);
     }
}