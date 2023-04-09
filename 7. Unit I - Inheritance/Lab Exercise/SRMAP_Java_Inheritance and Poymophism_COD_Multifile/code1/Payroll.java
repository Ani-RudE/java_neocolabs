//You are tasked with creating a payroll system for a company that has both salaried and hourly employees
//Payroll.java
import java.util.ArrayList;

public class Payroll {
     private ArrayList<Employee> employees;
     private double totalPay;

     public Payroll(int numEmployees) {
          employees = new ArrayList<Employee>(numEmployees);
          totalPay = 0;
     }

     public void addEmployee(Employee employee) {
          employees.add(employee);
     }

     public void calculatePayroll() {
          for (Employee employee : employees) {
               employee.calculatePay();
               totalPay += employee.getPay();
          }
     }

     public void printPayroll() {
          System.out.println("Payroll:");
          for (Employee employee : employees) {
               System.out.println(employee.getName() + ": " + employee.getPay());
          }
          System.out.println("Total payroll: " + totalPay);
     }
}