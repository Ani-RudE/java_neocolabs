import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CreateFile {
     public static void main(String[] args) throws IOException {

          String str;
          Scanner sc = new Scanner(System.in);
          str = sc.nextLine();
          FileWriter fw = new FileWriter("output.txt");

          for (int i = 0; i < str.length(); i++)
               fw.write(str.charAt(i));

          fw.close();

          FileReader fr = null;
          try {
               fr = new FileReader("output.txt");
          } catch (FileNotFoundException fe) {
               System.out.println("File not found");
          }

          BufferedReader br = new BufferedReader(fr);
          String[] words = null;
          String s;
          int flag = 0;
          while ((s = br.readLine()) != null) {
               words = s.split(" ");
               for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < words[i].length(); j++) {
                         char ch = words[i].charAt(j);
                         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                                   || ch == 'I' || ch == 'O' || ch == 'U') {
                              flag = 1;
                         }
                    }
                    if (flag == 1) {
                         System.out.println(words[i]);
                    }
                    flag = 0;
               }

          }
          fr.close();
     }

}