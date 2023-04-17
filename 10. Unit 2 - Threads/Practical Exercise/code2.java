//Profit or Loss
import java.util.*;

class HallBooking implements Runnable {
     public HallBooking(String hallName, double cost, int hallCapacity, int seatsBooked) {
          HallName = hallName;
          this.cost = cost;
          HallCapacity = hallCapacity;
          SeatsBooked = seatsBooked;
     }

     public HallBooking() {
          this.HallName = null;
          this.cost = 0;
          this.HallCapacity = 0;
          this.SeatsBooked = 0;
     }

     private String HallName;
     private double cost;
     private int HallCapacity;
     private int SeatsBooked;

     public String getHallName() {
          return HallName;
     }

     public void setHallName(String hallName) {
          HallName = hallName;
     }

     public double getCost() {
          return cost;
     }

     public void setCost(double cost) {
          this.cost = cost;
     }

     public int getHallCapacity() {
          return HallCapacity;
     }

     public void setHallCapacity(int hallCapacity) {
          HallCapacity = hallCapacity;
     }

     public int getSeatsBooked() {
          return SeatsBooked;
     }

     public void setSeatsBooked(int seatsBooked) {
          SeatsBooked = seatsBooked;
     }

     @Override
     public void run() {
          int res = this.SeatsBooked * 100;
          if (res > cost) {
               System.out.println("Profit");
          } else
               System.out.println("Loss");
     }
}

class Main {
     public static void main(String[] args) {
          int i, n;
          Scanner scan = new Scanner(System.in);
          n = Integer.parseInt(scan.nextLine());
          for (i = 0; i < n; i++) {
               HallBooking h = new HallBooking();
               h.setHallName(scan.nextLine());
               h.setCost(Double.parseDouble(scan.nextLine()));
               h.setHallCapacity(Integer.parseInt(scan.nextLine()));
               h.setSeatsBooked(Integer.parseInt(scan.nextLine()));
               Thread t = new Thread(h);
               t.start();
               scan.close();
          }
     }
}
