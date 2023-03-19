import java.util.*
import java.text.*;
import java.text.SimpleDateFormat;

abstract class Account {
     String name;
     int number;
     int balance;
     Date startDate;

     public Account(String name, int number, int balance, Date startDate) {
          this.name = name;
          this.number = number;
          this.balance = balance;
          this.startDate = startDate;
     }

     abstract public double calculateInterest(Date dueDate);
}

class CurrentAccount extends Account {
     public CurrentAccount(String name, int number, int balance, Date startDate) {
          super(name, number, balance, startDate);
     }

     public double calculateInterest(Date dueDate) {
          double interest;
          interest = (balance * 5 * (monthsDifference(startDate,
                    dueDate) / 12)) / 100;
          return interest;
     }

     public int monthsDifference(Date startDate, Date endDate) {
          Calendar c1 = new GregorianCalendar();
          c1.setTime(startDate);
          Calendar c2 = new GregorianCalendar();
          c2.setTime(endDate);
          int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR)) * 12;
          ans += c2.get(c2.MONTH) - c1.get(c1.MONTH);
          return ans;
     }
}

class SavingsAccount extends Account {
     public SavingsAccount(String name, int number, int balance, Date startDate) {
          super(name, number, balance, startDate);
     }

     public double calculateInterest(Date dueDate) {
          double interest;
          interest = (balance * 12 * (monthsDifference(startDate,
                    dueDate) / 12)) / 100;
          return interest;
     }

     public int monthsDifference(Date startDate, Date endDate) {
          Calendar c1 = new GregorianCalendar();
          c1.setTime(startDate);
          Calendar c2 = new GregorianCalendar();
          c2.setTime(endDate);
          int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR)) * 12;
          ans += c2.get(c2.MONTH) - c1.get(c1.MONTH);
          return ans;
     }
}

class AccountsMain {
     public static void main(String args[]) throws ParseException
     {
          Scanner scan = new Scanner(System.in);
          int type = Integer.parseInt(scan.nextLine());
          String name = scan.nextLine();
          int number = Integer.parseInt(scan.nextLine());
          int balance = Integer.parseInt(scan.nextLine());
          String dateString = scan.nextLine();
          DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
          Date startDate = formatter.parse(dateString);

          dateString = scan.nextLine();
          Date dueDate = formatter.parse(dateString);

          if (type == 1) {
               SavingsAccount sObj = new SavingsAccount(name, number, balance,
                         startDate);
               System.out.println(sObj.calculateInterest(dueDate));
          }

          else {
               CurrentAccount cObj = new CurrentAccount(name, number, balance,
                         startDate);
               System.out.println(cObj.calculateInterest(dueDate));
          }

          scan.close();
     }
}