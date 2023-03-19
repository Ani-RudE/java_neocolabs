import java.util.*;

interface Matrix{
 void diagonalsMinMax(int a[][]);
}

class Main implements Matrix {
     public void diagonalsMinMax(int[][] mat) {
          int n = mat.length;
          if (n == 0)
               return;
          int principalMin = mat[0][0], principalMax = mat[0][0];
          int secondaryMin = mat[n - 1][0], secondaryMax = mat[n - 1][0];

          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    if (i == j) {
                         if (mat[i][j] < principalMin) {
                              principalMin = mat[i][j];
                         }
                         if (mat[i][j] > principalMax) {
                              principalMax = mat[i][j];
                         }
                    }
                    if ((i + j) == (n - 1)) {
                         if (mat[i][j] < secondaryMin) {
                              secondaryMin = mat[i][j];
                         }
                         if (mat[i][j] > secondaryMax) {
                              secondaryMax = mat[i][j];
                         }
                    }
               }
          }

          System.out.println("Smallest Element - 1: "
                    + principalMin);
          System.out.println("Greatest Element - 1: "
                    + principalMax);

          System.out.println("Smallest Element - 2: "
                    + secondaryMin);
          System.out.println("Greatest Element - 2: "
                    + secondaryMax);
     }

     static public void main(String[] args) {
          int n;
          Scanner scan = new Scanner(System.in);
          n = scan.nextInt();
          int matrix[][] = new int[n][n];
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    matrix[i][j] = scan.nextInt();
               }
          }
          Main obj = new Main();
          obj.diagonalsMinMax(matrix);

          scan.close();
     }
}