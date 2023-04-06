//sayHello
import java.util.*;

class Hello {
     public String sayHello() {
          return "Hello";
     }

     public String sayHello(String s) {
          return ("Hello " + s);
     }

     public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
          String str = scan.nextLine();
          Hello s = new Hello();
          System.out.println(s.sayHello());
          System.out.println(s.sayHello(str));

          scan.close();
     }
}