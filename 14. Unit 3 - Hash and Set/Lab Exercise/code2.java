//Input two lines
import java.util.*;
import java.lang.*;
import java.io.*;

class Q02Medium_Set {
     public static void main(String[] args) throws java.lang.Exception {
          Scanner input = new Scanner(System.in);
          String line1 = input.nextLine();
          String line2 = input.nextLine();
          String words1[] = line1.split("[\\s]+");
          String words2[] = line2.split("[\\s]+");
          Set<String> uniqueWords1 = new HashSet<String>();
          uniqueWords1.addAll(Arrays.asList(words1));
          Set<String> uniqueWords2 = new HashSet<String>();
          uniqueWords2.addAll(Arrays.asList(words2));
          uniqueWords1.retainAll(uniqueWords2);
          System.out.println(uniqueWords1);
     }
}