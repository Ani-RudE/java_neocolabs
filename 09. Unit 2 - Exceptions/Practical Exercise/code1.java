//NumberFormatException
import java.util.*;

class ItemType {
     private String name;
     private double deposit;
     private double costPerDay;

     public ItemType() {
          this.name = null;
          this.deposit = 0;
          this.costPerDay = 0;
     }

     public ItemType(String name, double deposit, double costPerDay) {
          this.name = name;
          this.deposit = deposit;
          this.costPerDay = costPerDay;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getDeposit() {
          return deposit;
     }

     public void setDeposit(double deposit) {
          this.deposit = deposit;
     }

     public double getCostPerDay() {
          return costPerDay;
     }

     public void setCostPerDay(double costPerDay) {
          this.costPerDay = costPerDay;
     }

     public String toString() {
          return name + " " + deposit + " " + costPerDay;
     }
}

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          ItemType i = new ItemType();
          try {
               i.setName(scan.nextLine());
               i.setDeposit(Double.parseDouble(scan.nextLine()));
               i.setCostPerDay(Double.parseDouble(scan.nextLine()));
               System.out.println(i);
          } catch (NumberFormatException n) {
               System.out.println(n);
          }

          scan.close();
     }
}