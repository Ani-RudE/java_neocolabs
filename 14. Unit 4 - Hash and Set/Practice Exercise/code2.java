import java.io.*;
import java.util.*;
class Main {
public static void main(String [] args) {
	int i,n;
	Scanner sc = new Scanner(System.in);
	n = Integer.parseInt(sc.nextLine());
	Set<Integer> s1 = new HashSet<Integer>(n);
	Set<Integer> s2 = new HashSet<Integer>(n);
	for(i=0;i<n;i++) {
		s1.add(sc.nextInt());
	}
	for(i=0;i<n;i++) {
		s2.add(sc.nextInt());
	}
	if(s1.equals(s2)) {
		System.out.println("Both sets are same");
	}
	else {
		System.out.println("Both sets are different");
	}
}
}
