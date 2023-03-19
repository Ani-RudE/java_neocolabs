import java.util.*;

interface Product
{
 void ProductDetails();
void show_Bill();
}

class Customer {
     static Scanner sc;
     String C_Name;
     int C_ID;
     String P_Name;
     int P_Cost;

     void getdetails() {
          C_ID = sc.nextInt();
          sc.nextLine();
          C_Name = sc.nextLine();
     }

     void showdetails() {
          System.out.println("ID:" + C_ID);
          System.out.println("NAME:" + C_Name);
     }
}

class OrderOnline extends Customer implements Product {
     int no_of_items;
     int total_Bill = 0;

     public void ProductDetails() {
          no_of_items = sc.nextInt();

          for (int i = 0; i < no_of_items; i++) {
               sc.nextLine();
               P_Name = sc.nextLine();
               P_Cost = sc.nextInt();
               total_Bill += P_Cost;
          }
          if (total_Bill > 10000 && total_Bill <= 30000)
               total_Bill += (total_Bill * 5 / 100);
          else if (total_Bill > 30000 && total_Bill <= 50000)
               total_Bill += (total_Bill * 7 / 100);
          else if (total_Bill > 50000)
               total_Bill += (total_Bill * 9 / 100);
     }

     public void show_Bill() {
          System.out.println("Bill:" + total_Bill);
     }

     public static void main(String[] arg) {
          int no_of_orders;
          sc = new Scanner(System.in);
          no_of_orders = sc.nextInt();
          OrderOnline[] orders = new OrderOnline[no_of_orders];
          for (int i = 0; i < no_of_orders; i++) {
               orders[i] = new OrderOnline();
               orders[i].getdetails();
               orders[i].ProductDetails();
          }
          for (int i = 0; i < no_of_orders; i++) {
               orders[i].showdetails();
               orders[i].show_Bill();
          }
     }
}