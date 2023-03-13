// /* ---------------------------------  */
// import java.util.*;

// interface Product
// {
//  void ProductDetails();
// void show_Bill();
// }

// class Customer {
//      static Scanner sc;
//      String C_Name;
//      int C_ID;
//      String P_Name;
//      int P_Cost;

//      void getdetails() {
//           C_ID = sc.nextInt();
//           sc.nextLine();
//           C_Name = sc.nextLine();
//      }

//      void showdetails() {
//           System.out.println("ID:" + C_ID);
//           System.out.println("NAME:" + C_Name);
//      }
// }

// class OrderOnline extends Customer implements Product {
//      int no_of_items;
//      int total_Bill = 0;

//      public void ProductDetails() {
//           no_of_items = sc.nextInt();

//           for (int i = 0; i < no_of_items; i++) {
//                sc.nextLine();
//                P_Name = sc.nextLine();
//                P_Cost = sc.nextInt();
//                total_Bill += P_Cost;
//           }
//           if (total_Bill > 10000 && total_Bill <= 30000)
//                total_Bill += (total_Bill * 5 / 100);
//           else if (total_Bill > 30000 && total_Bill <= 50000)
//                total_Bill += (total_Bill * 7 / 100);
//           else if (total_Bill > 50000)
//                total_Bill += (total_Bill * 9 / 100);
//      }

//      public void show_Bill() {
//           System.out.println("Bill:" + total_Bill);
//      }

//      public static void main(String[] arg) {
//           int no_of_orders;
//           sc = new Scanner(System.in);
//           no_of_orders = sc.nextInt();
//           OrderOnline[] orders = new OrderOnline[no_of_orders];
//           for (int i = 0; i < no_of_orders; i++) {
//                orders[i] = new OrderOnline();
//                orders[i].getdetails();
//                orders[i].ProductDetails();
//           }
//           for (int i = 0; i < no_of_orders; i++) {
//                orders[i].showdetails();
//                orders[i].show_Bill();
//           }
//      }
// }





// /* ---------------------------------  */
// import java.util.Arrays;
// import java.util.Scanner;

// interface Growing{
// void isGrowing();
// }

// class GrowingNumber implements Growing {
//      int num;

//      public GrowingNumber(int i) {
//           num = i;
//      }

//      public void isGrowing() {
//           // int num=423;
//           boolean flag = false;
//           int currentDigit = num % 10;
//           num = num / 10;
//           while (num > 0) {
//                if (currentDigit <= num % 10) {
//                     flag = true;
//                     break;
//                }
//                currentDigit = num % 10;
//                num = num / 10;
//           }
//           if (flag) {
//                System.out.println("Not growing number");
//           } else {
//                System.out.println("Growing number");
//           }
//      }
// }

// class GrowingString implements Growing {
//      String s1;

//      public GrowingString(String string) {
//           s1 = string;
//      }

//      public void isGrowing() {
//           int n = s1.length();
//           char c[] = new char[n];

//           for (int i = 0; i < n; i++) {
//                c[i] = s1.charAt(i);
//           }
//           Arrays.sort(c);
//           boolean flag = true;
//           for (int i = 0; i < n; i++)
//                if (c[i] != s1.charAt(i))
//                     flag = false;

//           if (flag) {
//                System.out.println("Growing string");
//           } else {
//                System.out.println("Not growing string");
//           }
//      }
// }

// class Main {
//      public static void main(String args[]) {
//           Scanner sc = new Scanner(System.in);
//           int i = sc.nextInt();
//           String str = sc.nextLine();
//           // System.out.println(i + str);
//           GrowingNumber x = new GrowingNumber(i);
//           GrowingString s = new GrowingString(str);
//           x.isGrowing();
//           // System.out.println(str);
//           s.isGrowing();
//      }
// }





// /* ---------------------------------  */
// import java.util.Scanner;

// interface Case{
//  String move(String s);
// }

// class Main implements Case {

//      public String move(String str) {
//           int len = str.length();
//           String low = "";
//           String upr = "";
//           char ch;
//           for (int i = 0; i < len; i++) {
//                ch = str.charAt(i);
//                if (ch >= 'A' && ch <= 'Z') {
//                     upr += ch;
//                } else {
//                     low += ch;
//                }
//           }
//           return low + upr;
//      }

//      public static void main(String args[]) {
//           String str;
//           Scanner in = new Scanner(System.in);
//           str = in.nextLine();
//           Main obj = new Main();
//           obj.move(str);
//           System.out.println(obj.move(str));
//      }
// }





// /* ---------------------------------  */
// import java.util.Scanner;

// interface Matrix{
//  void diagonalsMinMax(int a[][]);
// }

// class Main implements Matrix {
//      public void diagonalsMinMax(int[][] mat) {
//           int n = mat.length;
//           if (n == 0)
//                return;
//           int principalMin = mat[0][0], principalMax = mat[0][0];
//           int secondaryMin = mat[n - 1][0], secondaryMax = mat[n - 1][0];

//           for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                     if (i == j) {
//                          if (mat[i][j] < principalMin) {
//                               principalMin = mat[i][j];
//                          }
//                          if (mat[i][j] > principalMax) {
//                               principalMax = mat[i][j];
//                          }
//                     }
//                     if ((i + j) == (n - 1)) {
//                          if (mat[i][j] < secondaryMin) {
//                               secondaryMin = mat[i][j];
//                          }
//                          if (mat[i][j] > secondaryMax) {
//                               secondaryMax = mat[i][j];
//                          }
//                     }
//                }
//           }

//           System.out.println("Smallest Element - 1: "
//                     + principalMin);
//           System.out.println("Greatest Element - 1: "
//                     + principalMax);

//           System.out.println("Smallest Element - 2: "
//                     + secondaryMin);
//           System.out.println("Greatest Element - 2: "
//                     + secondaryMax);
//      }

//      static public void main(String[] args) {
//           int n;
//           Scanner in = new Scanner(System.in);
//           n = in.nextInt();
//           int matrix[][] = new int[n][n];
//           for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                     matrix[i][j] = in.nextInt();
//                }
//           }
//           Main obj = new Main();
//           obj.diagonalsMinMax(matrix);
//      }
// }





// /* ---------------------------------  */
// import java.io.*;
// import java.util.Scanner;

// interface in1 {
//      final int a = 10;

//      void display();
// }

// class testClass implements in1 {
//      public void display() {
//           String sr;
//           Scanner sc = new Scanner(System.in);
//           sr = sc.nextLine();
//           System.out.println(sr);
//      }

//      public static void main(String[] args) {
//           testClass t = new testClass();
//           t.display();
//           System.out.println(a);
//      }
// }