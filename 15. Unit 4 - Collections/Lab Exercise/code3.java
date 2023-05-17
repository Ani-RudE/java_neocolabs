import java.util.*;
import java.io.*;

class Hall implements Comparable<Hall> {
     public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
          this.name = name;
          this.contactNumber = contactNumber;
          this.costPerDay = costPerDay;
          this.ownerName = ownerName;
     }

     public Hall() {
          this.name = null;
          this.contactNumber = null;
          this.costPerDay = 0;
          this.ownerName = null;
     }

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

     @Override
     public int compareTo(Hall h) {

          return Double.compare(this.costPerDay, h.costPerDay);
     }

     public String toString() {
          return name + " " + contactNumber + " " + costPerDay + " " + ownerName;
     }
}

class Main {
     public static void main(String[] args) {
          int i, n;
          Scanner sc = new Scanner(System.in);
          n = Integer.parseInt(sc.nextLine());
          Hall[] h = new Hall[n];
          ArrayList<Hall> halls = new ArrayList<Hall>(n);
          for (i = 0; i < n; i++) {
               h[i] = new Hall();
               h[i].setName(sc.nextLine());
               h[i].setContactNumber(sc.nextLine());
               h[i].setCostPerDay(Double.parseDouble(sc.nextLine()));
               h[i].setOwnerName(sc.nextLine());
               halls.add(h[i]);
          }
          Collections.sort(halls);
          for (i = 0; i < n; i++) {
               System.out.println(halls.get(i));
          }
     }
}