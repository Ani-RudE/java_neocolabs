//ArrayIndexOutOfBoundsException
import java.util.*;

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          try {
               int size = scan.nextInt();
               int[] intArray = new int[size];
               for (int i = 0; i < size; i++) {
                    intArray[i] = scan.nextInt();
               }
               int index = scan.nextInt();
               System.out.println(intArray[index]);
          } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Array index out of bound.");
          }
          try {
               int a = scan.nextInt();
               int b = scan.nextInt();
               int c = a / b;
               System.out.println(c);
          } catch (ArithmeticException e) {
               System.out.println(e);
          }
          try {
               String str = null;
               int index = scan.nextInt();
               System.out.println(str);
               System.out.println(str.charAt(index));
          } catch (NullPointerException n) {
               System.out.println(n);
          }

          scan.close();
     }
}
