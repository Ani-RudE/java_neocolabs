import java.io.*;
import java.util.*;
import java.util.Comparator;
import java.util.TreeSet;
class Empl{
    
    private String name;
    private int salary;
     
    public Empl(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Empl(){
    	this.name = null;
    	this.salary = 0;
    }
    public String toString(){
        return this.name+"-"+this.salary;
    }
}
class Main {
 
    public static void main(String a[]){
        
    	int i,n;
    	Scanner sc = new Scanner(System.in);
    	n = Integer.parseInt(sc.nextLine());
        TreeSet<Empl> nameComp = new TreeSet<Empl>(new MyNameComp());
        Empl[] em = new Empl[n];
        for(i=0;i<n;i++) {
        	em[i] = new Empl();
        	em[i].setName(sc.nextLine());
        	em[i].setSalary(Integer.parseInt(sc.nextLine()));
        	nameComp.add(em[i]);
        }
        System.out.println("After sorting the employee names:");
        for(Empl e:nameComp){
        	
            System.out.println(e);
        }
        System.out.println("After sorting the salary:");
        

        TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
        for(i=0;i<n;i++) {
        	
        	salComp.add(em[i]);
        }
        for(Empl e:salComp){
            System.out.println(e);
        }
    }
}
 
class MyNameComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getName().compareTo(e2.getName());
    }
}   
 
class MySalaryComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
