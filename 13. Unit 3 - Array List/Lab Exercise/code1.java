import java.util.*;
import java.lang.*;
import java.io.*;

class Q01Simple_List {
     public static void main(String[] args) throws java.lang.Exception {
          Scanner input = new Scanner(System.in);
          // Inputnumber of elements
          int number_of_elements = input.nextInt();
          if (number_of_elements <= 0)
               return;
          ArrayList<Integer> numList = new ArrayList<Integer>();
          for (int ctr = 0; ctr < number_of_elements; ctr++) {
               // Input next element
               int num = input.nextInt();
               ListIterator<Integer> listIter = numList.listIterator(numList.size());
               if (listIter.hasPrevious()) {
                    if (listIter.previous() < num)
                         numList.add(num);
               } else
                    numList.add(num);
          }
          System.out.println(numList);
     }
}