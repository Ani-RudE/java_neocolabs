
//Write a program to validate the given password
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {
     String name;
     String mobile;
     String username;
     String password;

     public User(String name, String mobile, String username, String password) {
          super();
          this.name = name;
          this.mobile = mobile;
          this.username = username;
          this.password = password;
     }
}

class UserBO {
     static void validate(User u) throws Exception {
          String pattern = "[!|@|#|$|%|^|&|*]";
          Pattern a = Pattern.compile(pattern);
          Matcher m1 = a.matcher(u.password);

          String pattern2 = "[1|2|3|4|5|6|7|8|9|0]";
          Pattern b = Pattern.compile(pattern2);
          Matcher m2 = b.matcher(u.password);
          // System.out.println(u.password);

          if ((u.password.length() < 9) || (u.password.length() > 20)) {
               throw new Exception("Should be minimum of 10 characters and maximum of 20 characters");
          } else if (!m2.find()) {
               throw new Exception("Should contain at least one digit");
          }

          else if (!m1.find()) {
               throw new Exception("It should contain at least one special character");
          } else
               System.out.println("Valid Password");
     }
}

class PasswordMain {
     public static void main(String args[]) throws Exception {
          Scanner scan = new Scanner(System.in);
          String name = scan.nextLine();
          String mobile = scan.nextLine();
          String username = scan.nextLine();
          String password = scan.nextLine();
          User userOne = new User(name, mobile, username, password);
          try {
               UserBO.validate(userOne);
          } catch (Exception e) {
               System.out.println(e);
          }

          scan.close();
     }
}
