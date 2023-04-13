//Considering the Banking Scenario
import java.text.*;
import java.util.*;

abstract class Account {
    private String name;
    private int number;
    private int balance;
    private Date startDate;

    public Account(String name, int number, int balance, Date startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }

    public abstract double calculateInterest(Date dueDate);

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public Date getStartDate() {
        return startDate;
    }
}

class SavingsAccount extends Account {
    private final static double interestRate = 0.12;

    public SavingsAccount(String name, int number, int balance, Date startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public double calculateInterest(Date dueDate) {
        long timeDiff = dueDate.getTime() - getStartDate().getTime();
        double interest = getBalance() * interestRate * (timeDiff / (1000.0 * 60 * 60 * 24 * 365));
        return interest;
    }
}

class CurrentAccount extends Account {
    private final static double interestRate = 0.05;

    public CurrentAccount(String name, int number, int balance, Date startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public double calculateInterest(Date dueDate) {
        long timeDiff = dueDate.getTime() - getStartDate().getTime();
        double interest = getBalance() * interestRate * (timeDiff / (1000.0 * 60 * 60 * 24 * 365));
        return interest;
    }
}

public class code1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accountType = scan.nextInt();
        scan.nextLine();
        String name = scan.nextLine();
        int number = scan.nextInt();
        int balance = scan.nextInt();
        scan.nextLine();
        String startDateStr = scan.nextLine();
        String endDateStr = scan.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = dateFormat.parse(startDateStr);
            endDate = dateFormat.parse(endDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Account account;
        if (accountType == 2) {
            account = new CurrentAccount(name, number, balance, startDate);
        } else {
            account = new SavingsAccount(name, number, balance, startDate);
        }

        double interest = account.calculateInterest(endDate);
        System.out.println(interest);

        scan.close();
    }
}