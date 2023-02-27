//Pairs of elements
import java.util.*;
// import java.io.*;

class Main{
    public static void printArray(int arr[], int n, int sum)
    {
        int s=0;
        
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if (arr[i]+arr[j]==sum)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                    s++;
                }
            }
        }
        
        if (s==0)
        {
            System.out.println("There is no pairs for the given sum.");
        }
    }
        
    public static void main(String[] args)
    {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int arr[]=new int[n];
            
        for (int i=0; i<n; i++)
        {
            arr[i]=scan.nextInt();
        }
            
        int sum=scan.nextInt();
        printArray(arr,n,sum);
            
        scan.close();
    }
}