//Create 4 classes Person, Staff, TemporaryStaff and a Main class
import java.util.Scanner;

class Person {
     private String name;

     Person(String s) {
          setName(s);
     }

     public void setName(String s) {
          name = s;
     }

     public String getName() {
          return name;
     }

     public void display() {
          System.out.println("Name : " + name);
     }
}

class Staff extends Person {
     private int staffId;

     Staff(String name, int staffId) {
          super(name);
          setStaffId(staffId);
     }

     public int getStaffId() {
          return staffId;
     }

     public void setStaffId(int staffId) {
          this.staffId = staffId;
     }

     public void display() {
          super.display();
          System.out.println("Staff Id : " + staffId);
     }
}

class TemporaryStaff extends Staff {
     private int days;
     private int hoursWorked;

     TemporaryStaff(String sname, int id, int days, int hoursWorked) {
          super(sname, id);
          this.days = days;
          this.hoursWorked = hoursWorked;
     }

     public int Salary() {
          int salary = days * hoursWorked * 50;

          return salary;
     }

     public void display() {
          super.display();
          System.out.println("No. of Days : " + days);
          System.out.println("No. of Hours Worked : " + hoursWorked);
          System.out.println("Total Salary : " + Salary());
     }
}

class MultilevelInheritanceExample {
     public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
          String name = scan.nextLine();
          int staffId = Integer.parseInt(scan.nextLine());
          int days = Integer.parseInt(scan.nextLine());
          int hoursWorked = Integer.parseInt(scan.nextLine());
          TemporaryStaff ts = new TemporaryStaff(name, staffId, days, hoursWorked);

          ts.display();
          scan.close();
     }
}