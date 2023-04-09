//HourlyEmployee.java
public class HourlyEmployee extends Employee {
     private double rate;
     private double hours;

     public HourlyEmployee(String name, double rate, double hours) {
          super(name);
          this.rate = rate;
          this.hours = hours;
     }

     @Override
     public void calculatePay() {
          if (hours <= 40) {
               pay = rate * hours;
          } else {
               pay = rate * 40 + rate * 1.5 * (hours - 40);
          }
     }
}