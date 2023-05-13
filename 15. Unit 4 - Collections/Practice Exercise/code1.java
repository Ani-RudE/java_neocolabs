import java.io.*;
import java.util.*;
class Main {
public static void main(String [] args) {
	int i,n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int [] ticketPrice = new int[n];
	int [] ticketBooked = new int[n];
	TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
	for(i=0; i<n;i++) {
		ticketPrice[i] = sc.nextInt();
		ticketBooked[i] = sc.nextInt();
		tm.put(ticketPrice[i], ticketBooked[i]);
	}
	System.out.println(tm);
}
}
