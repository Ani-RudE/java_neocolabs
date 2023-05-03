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
          System.out.println(obj1);
          System.out.println(obj2);
     }
}

class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          int n = Integer.parseInt(sc.nextLine());
          Test<String, Integer> obj = new Test<String, Integer>(s, n);
          obj.print();
     }
}