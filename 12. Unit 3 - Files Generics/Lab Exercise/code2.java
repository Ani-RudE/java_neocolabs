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
          int countWord = 0;
          int sentenceCount = 0;
          String s;
          while ((s = br.readLine()) != null) {
               String[] wordList = s.split("\\s+");
               countWord += wordList.length;
               String[] sentenceList = s.split("[!?.:]+");
               sentenceCount += sentenceList.length;
          }
          System.out.println(countWord + " " + sentenceCount);
     }
}