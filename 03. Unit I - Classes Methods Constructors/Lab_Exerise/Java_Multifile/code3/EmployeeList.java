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