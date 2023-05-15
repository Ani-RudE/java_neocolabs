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