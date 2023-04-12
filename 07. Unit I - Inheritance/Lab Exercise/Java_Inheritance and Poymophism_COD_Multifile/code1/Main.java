//You are tasked with creating a payroll system for a company that has both salaried and hourly employees
//Main.java
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          // System.out.println("Enter the number of employees: ");
          int numEmployees = scan.nextInt();
          Payroll payroll = new Payroll(numEmployees);
          for (int i = 0; i < numEmployees; i++) {
               // System.out.println("Enter the name of employee #" + (i + 1) + ":");
               String name = scan.next();
               // System.out.println("Enter the type of employee (salaried/hourly):");
               String type = scan.next();
               Employee employee;
               if (type.equals("salaried")) {
                    // System.out.println("Enter the monthly salary:");
                    double salary = scan.nextDouble();
                    employee = new SalariedEmployee(name, salary);
               } else {
                    // System.out.println("Enter the hourly rate:");
                    double rate = scan.nextDouble();
                    // System.out.println("Enter the number of hours worked:");
                    double hours = scan.nextDouble();
                    employee = new HourlyEmployee(name, rate, hours);
               }
               payroll.addEmployee(employee);
          }
          
          payroll.calculatePayroll();
          payroll.printPayroll();

          scan.close();
     }
}