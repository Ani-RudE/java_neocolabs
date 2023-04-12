//Overriding-simple
import java.util.*;
import java.text.DecimalFormat;

class Event {
     protected String name;
     protected String detail;
     protected String ownerName;

     public Event(String name, String detail, String ownerName) {
          this.name = name;
          this.detail = detail;
          this.ownerName = ownerName;
     }

     public Event() {
          this.name = null;
          this.detail = null;
          this.ownerName = null;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getDetail() {
          return detail;
     }

     public void setDetail(String detail) {
          this.detail = detail;
     }

     public String getOwnerName() {
          return ownerName;
     }

     public void setOwnerName(String ownerName) {
          this.ownerName = ownerName;
     }

     public Double projectedRevenue() {
          return 0.0;
     }
}

class Exhibition extends Event {
     public int noOfStall;

     public Exhibition(String name, String detail, String ownerName, int noOfStall) {
          super(name, detail, ownerName);
          this.noOfStall = noOfStall;
     }

     public Exhibition() {
          super();
          this.noOfStall = 0;
     }

     public int getNoOfStall() {
          return noOfStall;
     }

     public void setNoOfStall(int noOfStall) {
          this.noOfStall = noOfStall;
     }

     public Double projectedRevenue() {
          return (double) (noOfStall * 10000);
     }
}

class StageEvent extends Event {
     public int noOfShows;
     public int noOfSeatsPerShow;

     public StageEvent(String name, String detail, String ownerName, int noOfShows,
               int noOfSeatsPerShow) {
          super(name, detail, ownerName);
          this.noOfShows = noOfShows;
          this.noOfSeatsPerShow = noOfSeatsPerShow;
     }

     public StageEvent() {
          super();
          this.noOfShows = 0;
          this.noOfSeatsPerShow = 0;
     }

     public int getNoOfShows() {
          return noOfShows;
     }

     public void setNoOfShows(int noOfShows) {
          this.noOfShows = noOfShows;
     }

     public int getNoOfSeatsPerShow() {
          return noOfSeatsPerShow;
     }

     public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
          this.noOfSeatsPerShow = noOfSeatsPerShow;
     }

     public Double projectedRevenue() {
          return (double) (50 * noOfShows * noOfSeatsPerShow);
     }
}

class Main {
     public static void main(String[] args) {
          Event ev = new Event();
          Scanner scan = new Scanner(System.in);
          ev.name = scan.nextLine();
          ev.detail = scan.nextLine();
          ev.ownerName = scan.nextLine();
          Event e1 = new Event(ev.name, ev.detail, ev.ownerName);
          int n;
          DecimalFormat dd = new DecimalFormat("0.0");
          n = Integer.parseInt(scan.nextLine());
          Exhibition ex = new Exhibition();
          StageEvent se = new StageEvent();
          if (n == 1) {
               ex.noOfStall = Integer.parseInt(scan.nextLine());
               Exhibition ex1 = new Exhibition(ev.name, ev.detail, ev.ownerName,
                         ex.noOfStall);
               double result = ex1.projectedRevenue();
               System.out.println(dd.format(result));
          }
          if (n == 2) {
               se.noOfShows = Integer.parseInt(scan.nextLine());
               se.noOfSeatsPerShow = Integer.parseInt(scan.nextLine());
               StageEvent se1 = new StageEvent(ev.name, ev.detail, ev.ownerName,
                         se.noOfShows, se.noOfSeatsPerShow);
               double result = se1.projectedRevenue();
               System.out.println(dd.format(result));
          }

          scan.close();
     }
}