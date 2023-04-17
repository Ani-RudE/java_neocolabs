//Stall Revenue
import java.util.*;

class Stall implements Runnable {
     private String stallName;
     private String details;
     private double stallArea;
     private String owner;
     private double stallCost;

     public Stall(String stallName, String details, double stallArea, String owner) {
          this.stallName = stallName;
          this.details = details;
          this.stallArea = stallArea;
          this.owner = owner;
     }

     public Stall() {
          this.stallName = null;
          this.details = null;
          this.stallArea = 0;
          this.owner = null;
     }

     @Override
     public void run() {
          this.stallCost = this.stallArea * 150.0;
          System.out.println(this.stallCost);
     }

     public String getStallName() {
          return stallName;
     }

     public void setStallName(String stallName) {
          this.stallName = stallName;
     }

     public String getDetails() {
          return details;
     }

     public void setDetails(String details) {
          this.details = details;
     }

     public double getStallArea() {
          return stallArea;
     }

     public void setStallArea(double stallArea) {
          this.stallArea = stallArea;
     }

     public String getOwner() {
          return owner;
     }

     public void setOwner(String owner) {
          this.owner = owner;
     }

     public double getStallCost() {
          return stallCost;
     }

     public void setStallCost(double stallCost) {
          this.stallCost = stallCost;
     }
}

class Main {
     public static void main(String[] args) {
          int n, i;
          Scanner scan = new Scanner(System.in);
          n = Integer.parseInt(scan.nextLine());
          for (i = 0; i < n; i++) {
               Stall st = new Stall();
               st.setStallName(scan.nextLine());
               st.setDetails(scan.nextLine());
               st.setStallArea(Double.parseDouble(scan.nextLine()));
               st.setOwner(scan.nextLine());
               Thread s = new Thread(st);
               s.start();
               scan.close();
          }
     }
}