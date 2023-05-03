import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          EmployeeList employeeList = new EmployeeList();

          while (true) {
               /*
                * System.out.println("1. Add employee");
                * System.out.println("2. Remove employee");
                * System.out.println("3. Display all employees");
                * System.out.println("4. Exit");
                * System.out.print("Enter choice: ");
                */
               int choice = scanner.nextInt();

               switch (choice) {
                    case 1:
                         // System.out.print("Enter employee name: ");
                         String name = scanner.next();
                         // System.out.print("Enter employee ID: ");
                         int id = scanner.nextInt();
                         Employee employee = new Employee(name, id);
                         employeeList.addEmployee(employee);
                         break;
                    case 2:
                         // System.out.print("Enter employee ID to remove: ");
                         id = scanner.nextInt();
                         employeeList.removeEmployee(id);
                         break;
                    case 3:
                         employeeList.displayEmployees();
                         break;
                    case 4:
                         System.exit(0);
                         break;
                    default:
                         System.out.println("Invalid choice.");
               }
          }
     }
}





//Employee.java
public class Employee {
     private String name;
     private int id;

     public Employee(String name, int id) {
          this.name = name;
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public int getId() {
          return id;
     }

     public String toString() {
          return "Employee ID: " + id + ", Name: " + name;
     }
}







//EmployeeList.java
public class EmployeeList {
     private Employee[] employees = new Employee[10];
     private int size = 0;

     public void addEmployee(Employee employee) {
          if (size < employees.length) {
               employees[size] = employee;
               size++;
               System.out.println("Employee added.");
          } else {
               System.out.println("Employee list is full.");
          }
     }

     public void removeEmployee(int id) {
          for (int i = 0; i < size; i++) {
               if (employees[i].getId() == id) {
                    for (int j = i; j < size - 1; j++) {
                         employees[j] = employees[j + 1];
                    }
                    size--;
                    System.out.println("Employee removed.");
                    return;
               }
          }
          System.out.println("Employee not found.");
     }

     public void displayEmployees() {
          if (size == 0) {
               System.out.println("No employees to display.");
          } else {
               for (int i = 0; i < size; i++) {
                    System.out.println(employees[i]);
               }
          }
     }
}