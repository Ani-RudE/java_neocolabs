//Input a string
import java.util.*;
import java.lang.*;
import java.io.*;

class Q01Medium_Set {
     public static void main(String[] args) throws java.lang.Exception {
          Scanner input = new Scanner(System.in);
          String line = input.nextLine();
          String words[] = line.split("[\\s]+");
          Set<String> strings = new HashSet<String>();
          for (String word : words) {
               strings.add(word);
          }
          System.out.println(strings.size());
     }
}