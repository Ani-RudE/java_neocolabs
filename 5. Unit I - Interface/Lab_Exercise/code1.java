//Create an inteface rotate with the given functions.
import java.util.*;

interface Rotate {
     void leftRotate(int arr[], int d, int n);

     void leftRotatebyOne(int arr[], int n);

     void printArray(int arr[], int n);
}

class Main implements Rotate {
     public void leftRotate(int arr[], int d, int n) {
          for (int i = 0; i < d; i++)
               leftRotatebyOne(arr, n);
     }

     public void leftRotatebyOne(int arr[], int n) {
          int i, temp;
          temp = arr[0];
          for (i = 0; i < n - 1; i++)
               arr[i] = arr[i + 1];
          arr[i] = temp;
     }

     public void printArray(int arr[], int n) {
          for (int i = 0; i < n; i++)
               System.out.print(arr[i] + " ");
     }

     public static void main(String[] args) {
          Main rotate = new Main();
          int n;
          Scanner scan = new Scanner(System.in);
          n = scan.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = scan.nextInt();
          }
          rotate.leftRotate(arr, 1, n);
          rotate.printArray(arr, n);

          scan.close();
     }
}