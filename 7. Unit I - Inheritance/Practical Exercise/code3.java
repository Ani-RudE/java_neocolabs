//Create a class SilverStall with the following protected attributes
import java.util.*;

class SilverStall {
     protected String name;
     protected String detail;
     protected String owner;
     protected int cost;

     public SilverStall(String name, String detail, String owner, int cost) {
          this.name = name;
          this.detail = detail;
          this.owner = owner;
          this.cost = cost;
     }

     public SilverStall() {
          this.name = null;
          this.detail = null;
          this.owner = null;
          this.cost = 0;
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

     public String getOwner() {
          return owner;
     }

     public void setOwner(String owner) {
          this.owner = owner;
     }

     public int getCost() {
          return cost;
     }

     public void setCost(int cost) {
          this.cost = cost;
     }
}

class GoldStall extends SilverStall {
     private int tvSet;

     public GoldStall(String name, String detail, String owner, int cost, int tvSet) {
          this.name = name;
          this.detail = detail;
          this.owner = owner;
          this.cost = cost;
          this.tvSet = tvSet;
     }

     public GoldStall() {
          this.name = null;
          this.detail = null;
          this.owner = null;
          this.cost = 0;
          this.tvSet = 0;
     }

     public int getTvSet() {
          return tvSet;
     }

     public void setTvSet(int tvSet) {
          this.tvSet = tvSet;
     }
}

class PlatinumStall extends GoldStall {
     private int projector;

     public PlatinumStall(String name, String detail, String owner, int cost,
               int tvSet, int projector) {
          this.name = name;
          this.detail = detail;
          this.owner = owner;
          this.cost = cost;
          this.setTvSet(tvSet);
          this.projector = projector;
     }

     public PlatinumStall() {
          this.name = null;
          this.detail = null;
          this.owner = null;
          this.cost = 0;
          this.setTvSet(0);
          this.projector = 0;
     }

     public int getProjector() {
          return projector;
     }

     public void setProjector(int projector) {
          this.projector = projector;
     }
}

class Main {
     public static void main(String[] args) {
          int n;
          Scanner scan = new Scanner(System.in);
          n = Integer.parseInt(scan.nextLine());
          SilverStall s = new SilverStall();
          GoldStall g = new GoldStall();
          PlatinumStall p = new PlatinumStall();
          if (n == 1) {
               s.setName(scan.nextLine());
               s.setDetail(scan.nextLine());
               s.setOwner(scan.nextLine());
               s.setCost(Integer.parseInt(scan.nextLine()));
               SilverStall s1 = new SilverStall(s.name, s.detail, s.owner, s.cost);
               System.out.println(s.cost);
          }
          if (n == 2) {
               g.setName(scan.nextLine());
               g.setDetail(scan.nextLine());
               g.setOwner(scan.nextLine());
               g.setCost(Integer.parseInt(scan.nextLine()));
               g.setTvSet(Integer.parseInt(scan.nextLine()));
               GoldStall g1 = new GoldStall(g.name, g.detail, g.owner, g.cost, g.getTvSet());
               System.out.println(g.cost + (g.getTvSet() * 100));
          }
          if (n == 3) {
               p.setName(scan.nextLine());
               p.setDetail(scan.nextLine());
               p.setOwner(scan.nextLine());
               p.setCost(Integer.parseInt(scan.nextLine()));
               p.setTvSet(Integer.parseInt(scan.nextLine()));
               p.setProjector(Integer.parseInt(scan.nextLine()));
               PlatinumStall p1 = new PlatinumStall(p.name, p.detail, p.owner, p.cost, p.getTvSet(), p.getProjector());
               System.out.println(p.cost + (p.getTvSet() * 100) + (p.getProjector() * 500));
          }
          if (n > 3) {
               System.out.println("Invalid Input");
          }

          scan.close();
     }
}