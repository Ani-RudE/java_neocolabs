//Suppose you are the manager of a retail store and you want to manage the details of your employees
//Main.java
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          // System.out.print("Enter employee name: ");
          String name = scan.nextLine();
          // System.out.print("Enter employee age: ");
          int age = scan.nextInt();
          scan.nextLine();
          // System.out.print("Enter employee ID: ");
          String employeeId = scan.nextLine();
          // System.out.print("Enter employee salary: ");
          double salary = scan.nextDouble();
          Employee employee = new Employee(name, age, employeeId, salary);
          employee.display();

          scan.close();
     }
}