//Write a program for matrix multiplication using threads
import java.util.Scanner;

class Main {
     public Main() {
          Scanner scan = new Scanner(System.in);
          A_row = scan.nextInt();
          A_col = scan.nextInt();
          B_row = scan.nextInt();
          B_col = scan.nextInt();
          if (A_col == B_row) {
               matrix_A = new int[A_row][A_col];
               matrix_B = new int[B_row][B_col];
               mult_ans = new int[A_row][B_col];

               for (int i = 0; i < A_row; i++)
                    for (int j = 0; j < A_col; j++) {
                         matrix_A[i][j] = scan.nextInt();
                    }

               for (int i = 0; i < B_row; i++)
                    for (int j = 0; j < B_col; j++) {
                         matrix_B[i][j] = scan.nextInt();
                    }
               thread_pool = new mythread[A_row];

               for (int i = 0; i < A_row; i++) {
                    thread_pool[i] = new mythread(i);
                    thread_pool[i].start();
               }

               printer_thread = new threadprint[3];
               printer_thread[2] = new threadprint(mult_ans);
               printer_thread[2].start();
          } else {
               System.out.print("Invalid size");
          }

          scan.close();
     }

     public static void main(String[] args) {
          new Main();
     }

     private class mythread extends Thread {
          int index;

          mythread(int index) {
               this.index = index;
          }

          public void run() {
               for (int i = 0; i < B_col; i++) {
                    for (int j = 0; j < B_col; j++) {
                         mult_ans[index][i] += matrix_A[index][j] * matrix_B[j][i];
                    }
               }
          }
     }

     private class threadprint extends Thread {
          threadprint(int[][] matrix) {
               this.matrix = matrix;
          }

          public synchronized void run() {
               for (int i = 0; i < matrix.length; i++) {
                    // System.out.print("|");
                    for (int j = 0; j < matrix[0].length; j++) {
                         System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                    // .out.println("|");
               }
          }

          int[][] matrix;
     }

     private int A_row;
     private int A_col;
     private int B_row;
     private int B_col;
     private int[][] matrix_A;
     private int[][] matrix_B;
     private int[][] mult_ans;
     private mythread[] thread_pool;
     private threadprint[] printer_thread;
}