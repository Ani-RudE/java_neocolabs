import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
     public static void main(String[] args) throws IOException {

          int n;
          Scanner sc = new Scanner(System.in);
          n = sc.nextInt();
          int[] arr = new int[n];
          int i;
          for (i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }
          FileWriter fw = new FileWriter("output.txt");

          for (i = 0; i < n; i++)
               fw.write(arr[i]);
          fw.close();

          FileReader fr = null;
          try {
               fr = new FileReader("output.txt");
          } catch (FileNotFoundException fe) {
               System.out.println("File not found");
          }

          int ch, sum = 0;
          while ((ch = fr.read()) != -1) {
               if ((int) ch % 5 == 0)
                    System.out.println("Plant " + (int) ch + " gram seed");
               else
                    System.out.println("change " + (int) ch + " gram seed");
          }
          
          fr.close();
     }
}