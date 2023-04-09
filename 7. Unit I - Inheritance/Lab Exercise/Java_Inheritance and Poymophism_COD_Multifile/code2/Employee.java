//Suppose you are the manager of a retail store and you want to manage the details of your employees
// Employee.java
public class Employee extends Person {
     private String employeeId;
     private double salary;

     public Employee(String name, int age, String employeeId, double salary) {
          super(name, age);
          this.employeeId = employeeId;
          this.salary = salary;
     }

     public void display() {
          super.display();
          System.out.println("Employee ID: " + employeeId);
          System.out.println("Salary: " + salary);
     }
}