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