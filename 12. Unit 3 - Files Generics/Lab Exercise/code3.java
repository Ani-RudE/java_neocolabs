import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CreateFile {
     public static void main(String[] args) throws IOException {

          String str1, str2;
          Scanner sc = new Scanner(System.in);
          str1 = sc.nextLine();
          str2 = sc.nextLine();
          FileWriter fw = new FileWriter("output.txt");

          for (int i = 0; i < str1.length(); i++)
               fw.write(str1.charAt(i));

          fw.write("\n");

          for (int i = 0; i < str2.length(); i++)
               fw.write(str2.charAt(i));

          fw.close();
          int ch;

          FileReader fr = null;
          try {
               fr = new FileReader("output.txt");
          } catch (FileNotFoundException fe) {
               System.out.println("File not found");
          }

          while ((ch = fr.read()) != -1)
               System.out.print((char) ch);

          fr.close();
     }

}