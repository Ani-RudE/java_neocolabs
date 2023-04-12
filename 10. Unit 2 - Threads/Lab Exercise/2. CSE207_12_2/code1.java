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