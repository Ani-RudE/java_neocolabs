import java.util.*;

abstract class Complex {
     abstract float Real(float real1, float real2);

     abstract float Imaginary(float imag1, float imag2);

     abstract float Real1(float real1, float real2, float imag1, float imag2);

     abstract float Imaginary1(float real1, float real2, float imag1, float imag2);
}

class Addition extends Complex {
     float Real(float real1, float real2) {
          return real1 + real2;
     }

     float Imaginary(float imag1, float imag2) {
          return imag1 + imag2;
     }

     float Imaginary1(float real1, float real2, float imag1, float imag2) {
          return 0;
     }

     float Real1(float real1, float real2, float imag1, float imag2) {
          return 0;
     }
}

class Subtraction extends Complex {
     float Real(float real1, float real2) {
          return real1 - real2;
     }

     float Imaginary(float imag1, float imag2) {
          return imag1 - imag2;
     }

     float Imaginary1(float real1, float real2, float imag1, float imag2) {
          return 0;
     }

     float Real1(float real1, float real2, float imag1, float imag2) {
          return 0;
     }
}

class Multiplication extends Complex {
     float Real1(float real1, float real2, float imag1, float imag2) {
          return ((real1 * real2) - (imag1 * imag2));
     }

     float Imaginary1(float real1, float real2, float imag1, float imag2) {
          return ((real1 * imag2) + (imag1 * real2));
     }

     float Imaginary(float imag1, float imag2) {
          return 0;
     }

     float Real(float real1, float real2) {
          return 0;
     }
}

class Division extends Complex {
     float Real1(float real1, float real2, float imag1, float imag2) {
          return (((real1 * real2) + (imag1 * imag2)) / ((real2 * real2) + (imag2 * imag2)));
     }

     float Imaginary1(float real1, float real2, float imag1, float imag2) {
          return (((imag1 * real2) - (real1 * imag2)) / ((real2 * real2) + (imag2 * imag2)));
     }

     float Imaginary(float imag1, float imag2) {
          return 0;
     }

     float Real(float real1, float real2) {
          return 0;
     }
}

class Main {
     public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
          float real1 = scan.nextFloat();
          float imag1 = scan.nextFloat();
          float real2 = scan.nextFloat();
          float imag2 = scan.nextFloat();
          Complex b;
          b = new Addition();
          System.out.printf("Addition:\n\t%.4f", b.Real(real1, real2));
          if (b.Imaginary(imag1, imag2) >= 0) {
               System.out.print(" +");
          } else {
               System.out.print(" ");
          }
          System.out.printf("%.4f i", b.Imaginary(imag1, imag2));
          b = new Subtraction();
          System.out.printf("\nSubtraction:\n\t%.4f", b.Real(real1, real2));
          if (b.Imaginary(imag1, imag2) >= 0) {
               System.out.print(" +");
          } else {
               System.out.print(" ");
          }
          System.out.printf("%.4f i", b.Imaginary(imag1, imag2));
          b = new Multiplication();
          System.out.printf("\nMultiplication:\n\t%.4f", b.Real1(real1, real2, imag1, imag2));
          if (b.Imaginary1(real1, real2, imag1, imag2) >= 0) {
               System.out.print(" +");
          } else {
               System.out.print(" ");
          }
          System.out.printf("%.4f i", b.Imaginary1(real1, real2, imag1, imag2));
          b = new Division();
          System.out.printf("\nDivision:\n\t%.4f", b.Real1(real1, real2, imag1, imag2));
          if (b.Imaginary1(real1, real2, imag1, imag2) >= 0) {
               System.out.print(" +");
          } else {
               System.out.print(" ");
          }
          System.out.printf("%.4f i", b.Imaginary1(real1, real2, imag1, imag2));

          scan.close();
     }
}