//Write a java program to implement constructor overloading. Create a student class
import java.util.*;

class Student {
     String name;
     String dept;
     String college;

     public Student(String name, String dept, String college) {
          this.name = name;
          this.dept = dept;
          this.college = college;
     }

     public Student(String name, String dept) {
          this.name = name;
          this.dept = dept;
     }

     public void printStudentDetails() {
          System.out.println("Name : " + this.name);
          System.out.println("Dept : " + this.dept);
          System.out.println("College : " + this.college);
     }
}

class Test {
     public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          scan.nextLine(); // dummy
          Student s1;
          if (n == 2) {
               String name = scan.nextLine();
               String dept = scan.nextLine();
               s1 = new Student(name, dept);
               s1.printStudentDetails();
          } else if (n == 3) {
               String name = scan.nextLine();
               String dept = scan.nextLine();
               String college = scan.nextLine();
               s1 = new Student(name, dept, college);
               s1.printStudentDetails();
          }

          scan.close();
     }
}