class demo{
     public static void main(String[] args)
     {

     }
}

/* ------------------------------------------ */



import java.util.*;
import java.io.*;

class Main {
     public static void main(String[] args) {
          int i, n;
          Scanner sc = new Scanner(System.in);
          n = Integer.parseInt(sc.nextLine());
          ArrayList<String> names = new ArrayList<String>(n);
          for (i = 0; i < n; i++) {
               names.add(sc.nextLine());
          }
          String search = sc.nextLine();
          System.out.println(Collections.frequency(names, search));
     }
}







/* ------------------------------------------ */




//For code with header and footer, just write the below code as answer
class Sortbyroll implements Comparator<Student> {

     public int compare(Student a, Student b) {
          return a.rollno - b.rollno;
     }
}

class Sortbyname implements Comparator<Student> {

     public int compare(Student a, Student b) {
          return a.name.compareTo(b.name);
     }
}

class SortbyRank implements Comparator<Student> {

     private boolean ascending;

     public SortbyRank(boolean ascending) {
          this.ascending = ascending;
     }

     public int compare(Student a, Student b) {
          return ascending ? a.rank - (b.rank) : b.rank - (a.rank);
     }
}









/* ------------------------------------------ */



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











/* ------------------------------------------ */