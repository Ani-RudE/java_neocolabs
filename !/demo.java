class demo{
     public static void main(String[] args)
     {

     }
}

/* ------------------------------------------ */


import java.util.*;
import java.lang.*;
import java.io.*;

class Q01Simple_Sort {
     public static void main(String[] args) throws java.lang.Exception {
          Scanner input = new Scanner(System.in);
          // Input number of elements
          int number_of_elements = input.nextInt();
          input.nextLine();
          if (number_of_elements <= 0)
               return;

          List<String> list = new ArrayList<>();
          for (int ctr = 0; ctr < number_of_elements; ctr++) {
               // Input next string
               String str = input.nextLine();
               list.add(str);
          }
          Collections.sort(list, new Comparator<String>() {
               public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
               }
          });
          System.out.println(list);
          // Footer
     }
}




/* ------------------------------------------ */



import java.util.*;
import java.lang.*;
import java.io.*;

class Q01Simple_Search {
     public static void main(String[] args) throws java.lang.Exception {
          Scanner input = new Scanner(System.in);
          // Input number of elements
          int number_of_elements = input.nextInt();
          input.nextLine();
          if (number_of_elements <= 0)
               return;
          List<Integer> list = new ArrayList<>();
          for (int ctr = 0; ctr < number_of_elements; ctr++) {
               // Input each integer
               Integer num = input.nextInt();
               list.add(num);
          }
          Collections.sort(list);
          // Input integer to search
          Integer searchNum = input.nextInt();
          int pos = Collections.binarySearch(list, searchNum);
          if (pos < 0) {
               list.add(-pos - 1, searchNum);
               System.out.println("Not found, added at position: " + (-pos));
               System.out.println(list);
          } else {
               System.out.println("Found at position: " + (pos + 1));
               System.out.println(list);
          }
     }
}







/* ------------------------------------------ */




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class ItemType {
     private String name;
     private Double deposit;
     private Double costPerDay;

     @Override
     public String toString() {
          return String.format("%-20s%-20s%-20s", name, deposit, costPerDay);
     }

     public ItemType(String name, Double deposit, Double costPerDay) {
          super();
          this.name = name;
          this.deposit = deposit;
          this.costPerDay = costPerDay;
     }

}

class ArrayListObjectMain {
     public static void main(String args[]) {
          List<ItemType> items = new ArrayList<>();
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.nextLine());
          for (int i = 0; i < n; i++) {
               String name = sc.nextLine();
               Double deposit = Double.parseDouble(sc.nextLine());
               Double costPerDay = Double.parseDouble(sc.nextLine());
               items.add(new ItemType(name, deposit, costPerDay));
          }
          Iterator it = items.iterator();
          System.out.format("%-20s%-20s%-20s", "Name", "Deposit", "Cost Per Day");
          System.out.println();
          while (it.hasNext()) {
               System.out.println(it.next());
          }

     }

}








/* ------------------------------------------ */