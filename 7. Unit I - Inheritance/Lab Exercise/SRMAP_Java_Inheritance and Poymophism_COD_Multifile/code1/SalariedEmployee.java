//SalariedEmployee.java
public class SalariedEmployee extends Employee {
     private double salary;

     public SalariedEmployee(String name, double salary) {
          super(name);
          this.salary = salary;
     }

     @Override
     public void calculatePay() {
          pay = salary;
     }
}