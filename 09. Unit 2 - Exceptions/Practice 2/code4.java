//Write a program to read the Register Number and Mobile Number of a student
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
     static void validate(String r, String n) {
          if (r.length() != 9) {
               System.out.println("Invalid");
               throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
          }
          if (n.length() != 10) {
               System.out.println("Invalid");
               throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
          }
          // String pattern = "^[6|7|8|9]{1}\\d{9}";
          String pattern = "^[1-9]([0-9]){9,9}$";
          Pattern a = Pattern.compile(pattern);
          Matcher m1 = a.matcher(n);
          if (!m1.find()) {
               System.out.println("Invalid");
               throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
          }
          String pattern2 = "^[1-9][0-9]([A-Z]){3,3}([0-9]){4,4}$";
          Pattern b = Pattern.compile(pattern2);
          Matcher m2 = b.matcher(r);
          if (!m2.find()) {
               System.out.println("Invalid");
               throw new NoSuchElementException(
                         "Registration Number cannot contain any character other than digits and alphabets in format specified");
          }
     }

     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          String reg = sc.nextLine();
          String no = sc.nextLine();
          sc.close();
          try {
               validate(reg, no);
               System.out.println("Valid");
          } catch (Exception e) {
               System.out.println(e);
          }
     }
}