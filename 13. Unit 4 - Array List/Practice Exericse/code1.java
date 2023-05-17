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