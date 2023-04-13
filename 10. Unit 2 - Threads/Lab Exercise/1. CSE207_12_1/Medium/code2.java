//Implement MyThread1 and MyThread2 class which prints a table of two given numbers respectively
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