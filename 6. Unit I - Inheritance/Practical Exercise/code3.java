//You are in an Online shopping porta
import java.util.*;

class BasicCustomer {
     public String name;
     public String city;
     public int age;
     public String gender;
     public int billamount;

     BasicCustomer() {
          this.name = null;
          this.city = null;
          this.age = 0;
          this.gender = null;
          this.billamount = 0;
     }

     BasicCustomer(String n, String c, int age, String g, int amt) {
          this.name = n;
          this.city = c;
          this.age = age;
          this.gender = g;
          this.billamount = amt;
     }

     public void setName(String n) {
          this.name = n;
          System.out.println("Name: " + this.name);
     }

     public void setCity(String c) {
          this.city = c;
          System.out.println("City: " + this.city);
     }

     public void setAge(int a) {
          this.age = a;
          System.out.println("Age: " + this.age);
     }

     public void setGender(String g) {
          this.gender = g;
          System.out.println("Gender: " + this.gender);
     }

     public void setBillAmount(int b) {
          this.billamount = b;
          System.out.println("Total Bill Amount: " + this.billamount);
     }

     public String getName() {
          return name;
     }

     public String getCity() {
          return city;
     }

     public int getAge() {
          return age;
     }

     public String getGender() {
          return gender;
     }

     public int getBillAmount() {
          return billamount;
     }

     public void calculateDiscount() {
          if ((billamount >= 1) && (billamount <= 4999)) {
               System.out.println("Discount: 100");
          } else if ((billamount >= 5000) && (billamount <= 7499)) {
               System.out.println("Discount: 250");
          } else if ((billamount >= 7500) && (billamount <= 9999)) {
               System.out.println("Discount: 500");
          } else if ((billamount >= 10000) && (billamount <= 19999)) {
               System.out.println("Discount: 750");
          } else if ((billamount >= 20000) && (billamount <= 29999)) {
               System.out.println("Discount: 1000");
          } else if ((billamount >= 30000)) {
               System.out.println("Discount: 1500");
          }
     }
}

class PremiumCustomer extends BasicCustomer {
     public int subamt;

     PremiumCustomer() {
          super();
          this.subamt = 0;
     }

     PremiumCustomer(String name, String city, int age, String gen, int b, int sub) {
          super(name, city, age, gen, b);
          this.subamt = sub;
     }

     public void setSubamt(int s) {
          this.subamt = s;
          System.out.println("Subscription fee/month: " + this.subamt);
     }

     public int getSubamt() {
          return subamt;
     }

     public void calculateDiscount() {

          if ((billamount >= 1) && (billamount <= 4999)) {
               System.out.println("Discount: 200");
          } else if ((billamount >= 5000) && (billamount <= 7499)) {
               System.out.println("Discount: 400");
          } else if ((billamount >= 7500) && (billamount <= 9999)) {
               System.out.println("Discount: 700");
          } else if ((billamount >= 10000) && (billamount <= 19999)) {
               System.out.println("Discount: 1000");
          } else if ((billamount >= 20000) && (billamount <= 29999)) {
               System.out.println("Discount: 1500");
          } else if ((billamount >= 30000)) {
               System.out.println("Discount: 2000");
          }
     }
}

class Main {
     public static void main(String[] args) {
          int choice;
          Scanner scan = new Scanner(System.in);
          BasicCustomer b = new BasicCustomer();
          b.setName(scan.nextLine());
          b.setCity(scan.nextLine());
          b.setAge(Integer.parseInt(scan.nextLine()));
          b.setGender(scan.nextLine());
          b.setBillAmount(Integer.parseInt(scan.nextLine()));
          BasicCustomer b1 = new BasicCustomer(b.getName(), b.getCity(), b.getAge(), b.getGender(), b.getBillAmount());
          choice = Integer.parseInt(scan.nextLine());

          if (choice == 0) {
               b1.calculateDiscount();
          }
          if (choice == 1) {
               PremiumCustomer p = new PremiumCustomer();
               p.setSubamt(Integer.parseInt(scan.nextLine()));
               PremiumCustomer p1 = new PremiumCustomer(b.getName(), b.getCity(), b.getAge(), b.getGender(),
                         b.getBillAmount(), p.getSubamt());
               p1.calculateDiscount();
          }

          scan.close();
     }
}