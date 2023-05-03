import java.io.*;
import java.util.*;

class Sample {
     public static void main(String args[]) throws Exception {
          Scanner sc = new Scanner(System.in);
          FileWriter fw = new FileWriter("output.txt");

          String ch;
          int upper = 0, lower = 0, number = 0, special = 0;

          String s = sc.nextLine();

          fw.write(s);
          fw.close();

          FileReader fr = null;
          try {
               fr = new FileReader("output.txt");
          } catch (FileNotFoundException fe) {
               System.out.println("File not found");
          }

          Integer i = fr.read();
          Integer eof = -1;
          ch = i.toString();
          while (ch.charAt(0) != eof.toString().charAt(0)) {

               if (Integer.parseInt(ch) >= 'A' && Integer.parseInt(ch) <= 'Z')
                    upper++;
               else if (Integer.parseInt(ch) >= 'a' && Integer.parseInt(ch) <= 'z')
                    lower++;

               i = fr.read();
               ch = i.toString();
          }

          System.out.println(upper);
          System.out.println(lower);
     }
}