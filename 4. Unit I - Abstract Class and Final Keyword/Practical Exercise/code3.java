import java.util.*
import java.lang.Math;

abstract class maths {
     abstract public void rectanglePerimeter();

     abstract public void squarePerimeter();

     abstract public void trianglePerimeter();

     abstract public void trapezoidPerimeter();

     abstract public void circlePerimeter();
}

class perimeter extends maths {
     public int length;
     public int breadth;
     public int side;
     public int t1;
     public int t2;
     public int t3;
     public int tr1;
     public int tr2;
     public int tr3;
     public int tr4;
     public int radius;
     public int[] peri = new int[5];

     public void rectanglePerimeter() {
          this.peri[0] = 2 * (length + breadth);
          System.out.println(this.peri[0]);
     }

     public void squarePerimeter() {
          this.peri[1] = 4 * side;
          System.out.println(this.peri[1]);
     }

     public void trianglePerimeter() {
          this.peri[2] = t1 + t2 + t3;
          System.out.println(this.peri[2]);
     }

     public void trapezoidPerimeter() {
          this.peri[3] = tr1 + tr2 + tr3 + tr4;
          System.out.println(this.peri[3]);
     }

     public void circlePerimeter() {
          this.peri[4] = (int) Math.PI * 2 * radius;
          System.out.println(this.peri[4]);
     }

     public void calculateSum() {
          int sum = 0, i;
          for (i = 0; i < 5; i++) {
               sum += this.peri[i];
          }
          System.out.println(sum);
     }

     public void sortPerimeter() {
          Arrays.sort(this.peri);
          for (int i = 0; i < 5; i++) {
               System.out.print(this.peri[i] + " ");
          }
     }
}

class Main {
     public static void main(String[] args)
     {
          perimeter p = new perimeter();
          Scanner scan = new Scanner(System.in);

          p.length = scan.nextInt();
          p.breadth = scan.nextInt();
          p.rectanglePerimeter();

          p.side = scan.nextInt();
          p.squarePerimeter();

          p.t1 = scan.nextInt();
          p.t2 = scan.nextInt();
          p.t3 = scan.nextInt();
          p.trianglePerimeter();

          p.tr1 = scan.nextInt();
          p.tr2 = scan.nextInt();
          p.tr3 = scan.nextInt();
          p.tr4 = scan.nextInt();
          p.trapezoidPerimeter();

          p.radius = scan.nextInt();
          p.circlePerimeter();

          p.calculateSum();
          p.sortPerimeter();

          scan.close();
     }
}