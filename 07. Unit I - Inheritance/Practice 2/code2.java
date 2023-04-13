//Bank Account
import java.util.*;

class Account {
     protected String accName;
     protected String accNo;
     protected String bankName;

     public String getAccName() {
          return accName;
     }

     public void setAccName(String accName) {
          this.accName = accName;
     }

     public String getAccNo() {
          return accNo;
     }

     public void setAccNo(String accNo) {
          this.accNo = accNo;
     }

     public String getBankName() {
          return bankName;
     }

     public void setBankName(String bankName) {
          this.bankName = bankName;
     }

     protected void display() {
          System.out.println(accName);
          System.out.println(accNo);
          System.out.println(bankName);
     }
}

class CurrentAccount extends Account {
     private String tinNumber;

     public CurrentAccount() {
     }

     public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
          this.accName = accName;
          this.accNo = accNo;
          this.bankName = bankName;
          this.tinNumber = tinNumber;
     }

     public String getTinNumber() {
          return tinNumber;
     }

     public void setTinNumber(String tinNumber) {
          this.tinNumber = tinNumber;
     }

     public void display() {
          super.display();
          System.out.println(tinNumber);
     }
}

class SavingsAccount extends Account {
     private String orgName;

     public SavingsAccount() {
     }

     public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
          this.accName = accName;
          this.accNo = accNo;
          this.bankName = bankName;
          this.orgName = orgName;
     }

     public String getOrgName() {
          return orgName;
     }

     public void setOrgName(String orgName) {
          this.orgName = orgName;
     }

     public void display() {
          super.display();
          System.out.println(orgName);
     }
}

public class code2 {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int choice = scan.nextInt();
          scan.nextLine();
          String accName = scan.next();
          String accNo = scan.next();
          String bankName = scan.next();
          if (choice == 1) {
               String orgName = scan.next();
               SavingsAccount sa = new SavingsAccount(accName, accNo, bankName, orgName);
               sa.display();
          } else if (choice == 2) {
               String tinNumber = scan.next();
               CurrentAccount ca = new CurrentAccount(accName, accNo, bankName, tinNumber);
               ca.display();
          }

          scan.close();
     }
}