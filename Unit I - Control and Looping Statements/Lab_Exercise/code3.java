import java.util.*;

class Main {
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int i,j,k,N,count=0;
 N = sc.nextInt();
 for(i=1;i<=N;i++)
 {
 k=1;
 for(j=0;j<i;j++)
 {
 System.out.print(i);
 if(k<i)
 {
 System.out.print("*");
k=k+1;
 }
 }
 System.out.println();
 }
 for(i=N;i>0;i--)
 {
 k=1;
 for(j=0;j<i;j++)
 {
 System.out.print(i);
 if(k<i)
 {
 System.out.print("*");
k=k+1;
 }