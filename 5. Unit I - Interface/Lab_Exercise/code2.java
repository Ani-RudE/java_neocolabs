//Program to count a minimum number of front moves to sort an array.
import java.util.*

interface Move {
     int minmoves(int arr[], int n);
}

class Main implements Move {
     public int minmoves(int arr[], int n) {
          int expectedItem = n;
          for (int i = n - 1; i >= 0; i--) {
               if (arr[i] == expectedItem)
                    expectedItem--;
          }
          System.out.print(expectedItem);
          return expectedItem;
     }

     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int n;
          n = scan.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = scan.nextInt();
          }
          Main obj = new Main();
          obj.minmoves(arr, n);

          scan.close();
     }
}