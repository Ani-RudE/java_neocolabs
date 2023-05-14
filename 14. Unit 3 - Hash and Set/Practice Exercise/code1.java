//number of unique elements
import java.io.*;
import java.util.*;
class Main {
	public static void main(String [] args) {
		int i,n;
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		Set<String> names = new HashSet<String>(n);
		for(i=0; i<n;i++) {
			names.add(sc.nextLine());
		}
		System.out.println(names.size());
	}
}
