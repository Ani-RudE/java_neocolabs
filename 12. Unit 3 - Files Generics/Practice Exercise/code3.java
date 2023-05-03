import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PipedInputStream;

class Main {
     public static void main(String aa[]) throws Exception {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int c;
          while ((c = br.read()) != -1) {
               System.out.print(" " + (char) c);
          }
          System.out.println();
          System.out.println();
     }
}