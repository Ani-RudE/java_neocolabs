//Develop a program for banking system for account management
import java.util.*;

class Account {
     public int AccountId;
     public String HolderName;
     public int balance;

     Account() {
          this.AccountId = 0;
          this.HolderName = null;
          this.balance = 0;
     }

     Account(int id, String name, int bal) {
          if (id >= 100 && id <= 999) {
               this.AccountId = id;
          } else {
               this.AccountId = -1;
          }
          this.HolderName = name;
          if (bal >= 0) {
               this.balance = bal;
          } else {
               this.balance = 0;
          }
     }

     public void setAccountBalance(int s) {
          System.out.println(this.balance);
     }

     public int credit(int amount) {
          this.balance += amount;
          return this.balance;
     }
}

class VIPAccount extends Account {
     VIPAccount() {
          super();
     }

     VIPAccount(int id, String name, int bal) {
          super(id, name, bal);
     }

     public void setAccountBalance(int s) {
          super.setAccountBalance(s);
          if (s < -10000) {
               System.out.println("The balance can be negative but no less than -10000");
          } else {
               System.out.println(s);
          }
     }
}

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          VIPAccount va = new VIPAccount();
          va.AccountId = Integer.parseInt(scan.nextLine());
          va.HolderName = scan.nextLine();
          va.balance = Integer.parseInt(scan.nextLine());
          VIPAccount va1 = new VIPAccount(va.AccountId, va.HolderName, va.balance);
          System.out.println(va1.AccountId + " " + va1.HolderName + " " + va1.balance);
          int amount = Integer.parseInt(scan.nextLine());
          System.out.println(va1.credit(amount));
          int sal = Integer.parseInt(scan.nextLine());
          va1.setAccountBalance(sal);

          scan.close();
     }
}