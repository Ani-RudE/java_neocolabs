//User defined Exception
import java.util.*;

class Bank {
     private int accno;
     private String name;
     private double bal;

     public Bank() {
          this.accno = 0;
          this.name = null;
          this.bal = (double) 0;
     }

     public Bank(int accno, String name, double bal) {
          this.accno = accno;
          this.name = name;
          this.bal = bal;
     }

     public int getAccno() {
          return accno;
     }

     public void setAccno(int accno) {
          this.accno = accno;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getBal() {
          return bal;
     }

     public void setBal(double bal) {
          this.bal = bal;
     }

     public String toString() {
          return accno + " " + name + " " + bal;
     }
}

class BankBO {
     public void validate(Bank b) throws InvalidBalanceException {
          if (b.getBal() < 1000) {
               throw new InvalidBalanceException("Balance is less than 1000");
          }
     }
}

class InvalidBalanceException extends Exception {
     public InvalidBalanceException(String s) {
          System.out.println(s);
     }
}

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          Bank b = new Bank();
          b.setAccno(Integer.parseInt(scan.nextLine()));
          b.setName(scan.nextLine());
          b.setBal(Double.parseDouble(scan.nextLine()));
          BankBO bbo = new BankBO();
          try {
               bbo.validate(b);
               System.out.println(b);
          } catch (Exception e) {
               System.out.println(e);
          }

          scan.close();
     }
}