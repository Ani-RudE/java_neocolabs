//Koutheesh is having
import java.util.*;
import java.util.stream.Collectors;

public class code4 {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          // Read the number of integers to be sorted
          int n = scan.nextInt();

          // Create a list to store the integers
          List<Integer> list = new ArrayList<>();

          // Read the integers and add them to the list
          for (int i = 0; i < n; i++) {
               int num = scan.nextInt();
               list.add(num);
          }

          // Sort the list using Stream functions
          List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

          // Print the sorted list
          for (int num : sortedList) {
               System.out.println(num);
          }

          scan.close();
     }
}