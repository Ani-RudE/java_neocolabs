import java.util.*;

abstract class Accounts {
     public int balance;
     public int accno;
     public String name;
     public String address;

     abstract public void withdrawl(int amount);

     abstract public void deposit(int amount);

     public Accounts(int balance, int accno, String name, String address) {
          this.balance = balance;
          this.accno = accno;
          this.name = name;
          this.address = address;
     }

     public void display() {
          System.out.print(this.accno + " ");
          System.out.print(this.name + " ");
          System.out.print(this.balance + " ");
          System.out.print(this.address);
     }
}

class SavingsAccount extends Accounts {
     int roi;

     public SavingsAccount(int balance, int accno, String name, String address) {
          super(balance, accno, name, address);
     }

     public void setRoi(int r) {
          this.roi = r;
     }

     public int getRoi() {
          return roi;
     }

     public void calcamt(int balance) {
          int interestAmount = (int) balance * roi;
          // System.out.println(interestAmount);
          interestAmount /= 100;
          int finalAmount = balance + interestAmount;
          System.out.println(finalAmount);
     }

     public void display() {
          System.out.print(this.accno + " ");
          System.out.print(this.name + " ");
          System.out.print(this.balance + " ");
          System.out.println(this.address);
     }

     public void deposit(int amt) {
          int res1 = this.balance + amt;
          System.out.println(res1);
     }

     public void withdrawl(int amt) {
          int res2 = this.balance - amt;
          System.out.println(res2);
     }
}

class CurrentAccount extends Accounts {
     int draftLimit;

     public CurrentAccount(int balance, int accno, String name, String address) {
          super(balance, accno, name, address);
     }

     public void setDraftLimit(int dl) {
          this.draftLimit = dl;
     }

     public int getDraftLimit() {
          return draftLimit;
     }

     public void display() {
          System.out.print(this.accno + " ");
          System.out.print(this.name + " ");
          System.out.print(this.balance + " ");
          System.out.println(this.address);
          System.out.println(this.draftLimit);
     }

     public void deposit(int amt) {
          int res1 = this.balance + amt;
          System.out.println(res1);
     }

     public void withdrawl(int amt) {
          int res2 = this.balance - amt;
          System.out.println(res2);
     }
}

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int accno = Integer.parseInt(scan.nextLine());
          int balance = Integer.parseInt(scan.nextLine());
          String name = scan.nextLine();
          String address = scan.nextLine();
          int type = Integer.parseInt(scan.nextLine());

          if (type == 1)
          {
               SavingsAccount s = new SavingsAccount(balance, accno, name, address);
               s.setRoi(Integer.parseInt(scan.nextLine()));
               s.display();
               s.calcamt(balance);

               int dw = Integer.parseInt(scan.nextLine());
               int amt = Integer.parseInt(scan.nextLine());

               if (dw == 1)
               {
                    s.deposit(amt);
               }

               if (dw == 2)
               {
                    s.withdrawl(amt);
               }
          }

          if (type == 2)
          {
               CurrentAccount c = new CurrentAccount(balance, accno, name, address);
               c.setDraftLimit(Integer.parseInt(scan.nextLine()));
               c.display();

               int dw1 = Integer.parseInt(scan.nextLine());
               int amt1 = Integer.parseInt(scan.nextLine());

               if (dw1 == 1)
               {
                    c.deposit(amt1);
               }

               if (dw1 == 2)
               {
                    c.withdrawl(amt1);
               }
          }

          scan.close();
     }
}