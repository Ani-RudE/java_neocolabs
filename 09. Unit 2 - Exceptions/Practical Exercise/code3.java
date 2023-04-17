//Write a program to valid the email address
import java.util.*;

class DomainException extends Exception {
     String expDescription;

     // public constructor with String argument
     DomainException(String expDescription) {
          super(expDescription);
     }
}

class DotException extends Exception {
     String expDescription;

     // public constructor with String argument
     DotException(String expDescription) {
          super(expDescription);
     }
}

class AtTheRateException extends Exception {
     String expDescription;

     // public constructor with String argument
     AtTheRateException(String expDescription) {
          super(expDescription);
     }
}

class EmailValidationMain {
     public static void main(String[] args) {

          Scanner myObj = new Scanner(System.in);

          String email = myObj.next();

          boolean checkEndDot = false;
          checkEndDot = email.endsWith(".");

          int indexOfAt = email.indexOf('@');
          int lastIndexOfAt = email.lastIndexOf('.');
          int countOfAt = 0;
          for (int i = 0; i < email.length(); i++) {
               if (email.charAt(i) == '@')
                    countOfAt++;
          }
          String buffering = email.substring(email.indexOf('@') + 1, email.length());
          int len = buffering.length();
          int countOfDotAfterAt = 0;
          for (int i = 0; i < len; i++) {
               if (buffering.charAt(i) == '.')
                    countOfDotAfterAt++;
          }
          String userName = email.substring(0, email.indexOf('@'));
          String domainName = email.substring(email.indexOf('.') + 1, email.length());

          int domainCheck = 0;
          if ((domainName.equals("in")) || (domainName.equals("com")) ||
                    (domainName.equals("net")) || (domainName.equals("biz")))
               domainCheck = 1;

          try {
               if ((checkEndDot) || (countOfDotAfterAt != 1)) {
                    throw new DotException("Invalid Dot usage");
               }

               if (countOfAt != 1) {
                    throw new AtTheRateException("Invalid @ usage");
               }

               if (domainCheck != 1) {
                    throw new DomainException("Invalid Domain");
               }

          } catch (DotException e) {
               System.out.println(e);
          } catch (AtTheRateException e) {
               System.out.println(e);
          } catch (DomainException e) {
               System.out.println(e);
          }
          if ((countOfAt == 1) && (userName.endsWith(".") == false) && (domainCheck == 1) &&
                    (countOfDotAfterAt == 1) && ((indexOfAt + 3) <= (lastIndexOfAt) && !checkEndDot)) {
               System.out.println("Valid email address");
          } else {
               System.out.println("Invalid email address");
          }
          myObj.close();
     }
}
