import java.io.*;
import java.util.*;
class Main {
	public static void main(String [] args) {
		int i,n;
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		Set<String> mail = new HashSet<String>(n);
		for(i=0; i<n;i++) {
			mail.add(sc.nextLine());
		}
		Set<String> mail1 = new HashSet<String>();
		String detail = sc.nextLine();
		String m[] = detail.split(",");
		for(String m1 : m) {
			mail1.add(m1);	
		}
		if(mail.containsAll(mail1)) {
			System.out.println("Email addresses are present");
		}
		else {
			System.out.println("Email addresses are not present");
		}
}
}
