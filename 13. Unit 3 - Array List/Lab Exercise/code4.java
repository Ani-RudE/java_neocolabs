import java.util.*;
import java.io.*;

class Hall {
     private String name;
     private String contactNumber;
     private double costPerDay;
     private String ownerName;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getContactNumber() {
          return contactNumber;
     }

     public void setContactNumber(String contactNumber) {
          this.contactNumber = contactNumber;
     }

     public double getCostPerDay() {
          return costPerDay;
     }

     public void setCostPerDay(double costPerDay) {
          this.costPerDay = costPerDay;
     }

     public String getOwnerName() {
          return ownerName;
     }

     public void setOwnerName(String ownerName) {
          this.ownerName = ownerName;
     }

     public Hall() {
          this.name = null;
          this.contactNumber = null;
          this.costPerDay = 0;
          this.ownerName = null;
     }

     public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
          this.name = name;
          this.contactNumber = contactNumber;
          this.costPerDay = costPerDay;
          this.ownerName = ownerName;
     }

     public void display() {
          System.out.printf("%-20s%-20s%-20s%-20s\n", name, contactNumber, costPerDay, ownerName);
     }
}

class Main {
     public static void main(String[] args) {
          int i, n;
          Scanner sc = new Scanner(System.in);
          n = Integer.parseInt(sc.nextLine());
          ArrayList<Hall> h1 = new ArrayList<>(n);
          Hall[] h = new Hall[n];
          for (i = 0; i < n; i++) {
               h[i] = new Hall();
               h[i].setName(sc.nextLine());
               h[i].setContactNumber(sc.nextLine());
               h[i].setCostPerDay(Double.parseDouble(sc.nextLine()));
               h[i].setOwnerName(sc.nextLine());
               h1.add(h[i]);
          }
          int index = Integer.parseInt(sc.nextLine());
          if (h1.isEmpty()) {
               System.out.println("The list is empty");
          } else {
               h1.remove(index);
               System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "CostperDay", "Owner Name");
          }

          for (i = 0; i < n - 1; i++) {
               h1.get(i).display();
          }
     }
}