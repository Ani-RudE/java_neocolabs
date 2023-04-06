//A company maintains a database
import java.util.*;

class Employee {
     public int empId;
     public float salary;

     public Employee(int empId, float salary) {
          this.empId = empId;
          this.salary = salary;
     }

     public String toString() {
          return (empId + "\n" + salary);
     }
}

class empLevel extends Employee {
     public int level;

     public empLevel(int empId, float salary) {
          super(empId, salary);
          if (salary > 100)
               level = 1;
          else
               level = 2;
     }

     public String toString() {
          return (super.toString() + "\n" + level);
     }
}

class empMain {
     public static void main(String args[]) {
          int emplId;
          float salary;
          Scanner scan = new Scanner(System.in);
          emplId = scan.nextInt();
          salary = scan.nextFloat();
          empLevel el = new empLevel(emplId, salary);
          System.out.println(el.toString());

          scan.close();
     }
}