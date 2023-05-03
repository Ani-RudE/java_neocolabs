import java.io.*;
import java.util.*;

class Test<T, U> {
     T obj1;
     U obj2;

     Test(T obj1, U obj2) {
          this.obj1 = obj1;
          this.obj2 = obj2;
     }

     public void print() {
          System.out.println(obj2);
          System.out.println(obj1);
     }
}

class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.nextLine());
          String s = sc.nextLine();
          Test<String, Integer> obj = new Test<String, Integer>(s, n);
          obj.print();
     }
}