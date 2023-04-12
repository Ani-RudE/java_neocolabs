//Function Overloading - An ice cream vendor
import java.util.*;
import java.text.*;

class Icecream {
     public double qty, qty_rd, pi = 3.14;
     DecimalFormat d = new DecimalFormat("0.00");

     public void Quantity(int r) {
          qty = 1.33 * pi * r * r * r;
          qty_rd = Math.round(qty * 100.0) / 100.0;
          System.out.println(d.format(qty_rd));
     }

     public void Quantity(int r, int h) {
          qty = 0.33 * pi * r * r * h;
          qty_rd = Math.round(qty * 100.0) / 100.0;
          System.out.println(d.format(qty_rd));
     }
}

class IcecreamMain {
     public static void main(String args[]) {
          int r, h;
          Icecream ic = new Icecream();
          Scanner scan = new Scanner(System.in);
          r = scan.nextInt();
          if (scan.hasNextInt()) {
               h = scan.nextInt();
               ic.Quantity(r, h);
          } else
               ic.Quantity(r);

          scan.close();
     }
}