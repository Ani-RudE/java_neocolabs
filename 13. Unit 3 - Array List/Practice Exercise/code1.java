import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class ItemType{
	private String name;
	private Double deposit;
	private Double costPerDay;
	
	@Override
	public String toString() {
		return String.format( "%-20s%-20s%-20s",name,deposit,costPerDay); 
	}
	public ItemType(String name, Double deposit, Double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	
		
}

class ArrayListObjectMain {
	public static void main(String args[]) {
		List <ItemType> items = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String name = sc.nextLine();
			Double deposit = Double.parseDouble(sc.nextLine());
			Double costPerDay = Double.parseDouble(sc.nextLine());
			items.add(new ItemType(name,deposit,costPerDay));
		}
		Iterator it = items.iterator();
		System.out.format("%-20s%-20s%-20s","Name","Deposit","Cost Per Day");
		System.out.println();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
	}
	
}
