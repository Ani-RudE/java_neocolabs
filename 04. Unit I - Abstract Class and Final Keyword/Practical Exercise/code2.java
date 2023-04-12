import java.util.*;

abstract class ItemType {
     public abstract double calculateAmount();
}

class wooden extends ItemType {
     private int noOfItems;
     private double cost;

     public int getNoOfItems() {
          return noOfItems;
     }

     public void setNoOfItems(int noOfItems) {
          this.noOfItems = noOfItems;
     }

     public double getCost() {
          return cost;
     }

     public void setCost(double cost) {
          this.cost = cost;
     }

     public wooden() {
          this.noOfItems = 0;
          this.cost = (double) 0;
     }

     public wooden(int noOfItems, double cost) {
          this.noOfItems = noOfItems;
          this.cost = cost;
     }

     public double calculateAmount() {
          return noOfItems * cost;
     }
}

class electronics extends ItemType {
     private String type;
     private double amount;

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public double getAmount() {
          return amount;
     }

     public void setAmount(double amount) {
          this.amount = amount;
     }

     public electronics() {
          this.type = null;
          this.amount = (double) 0;
     }

     public electronics(String type, double amount) {
          this.type = type;
          this.amount = amount;
     }

     public double calculateAmount() {
          double result = 0;
          if (type.contains("Academics")) {
               result = amount - (0.05 * amount);
          } else if (type.contains("Commercial")) {
               result = amount;
          }
          return result;
     }
}

class code2 {
     public static void main(String[] args) {
          int choice;
          Scanner scan = new Scanner(System.in);
          choice = Integer.parseInt(scan.nextLine());
          wooden w = new wooden();
          electronics e = new electronics();
          if (choice == 1) {
               w.setNoOfItems(Integer.parseInt(scan.nextLine()));
               w.setCost(Double.parseDouble(scan.nextLine()));
               double res = w.calculateAmount();
               System.out.println(res);
          }
          if (choice == 2) {
               e.setType(scan.nextLine());
               e.setAmount(Double.parseDouble(scan.nextLine()));
               double orgAmount = e.calculateAmount();
               System.out.println(orgAmount);
          }

          scan.close();
     }
}