//You are tasked with creating a payroll system for a company that has both salaried and hourly employees
//Employee.java
public abstract class Employee {
     protected String name;
     protected double pay;

     public Employee(String name) {
          this.name = name;
     }

     public abstract void calculatePay();

     public String getName() {
          return name;
     }

     public double getPay() {
          return pay;
     }
}
