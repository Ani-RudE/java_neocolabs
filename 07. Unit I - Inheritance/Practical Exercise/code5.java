//Create 5 classes as shown in the below diagram
import java.util.*;

class Person {
     private String name;
     private int birthYear;

     public Person(String n, int byear) {
          name = n;
          birthYear = byear;
     }

     public String toString() {
          return "Name : " + name + "\nBirthYear : " + birthYear + "";
     }
}

class Staff extends Person {
     protected double salary;

     public Staff(String n, int byear, double s) {
          super(n, byear);
          salary = s;
     }

     public String toString() {
          return super.toString() + "\nOld Salary : " + salary;
     }
}

class Student extends Person {
     private String major;
     private double att;

     public Student(String n, int byear, String m, double at) {
          super(n, byear);
          major = m;
          att = at;
     }

     public String atten(double att) {
          return (att >= 75) ? "Yes" : "No";
     }

     public String toString() {
          return super.toString() + "\nDepartment : " + major + "\nEligible : " + atten(att);
     }
}

class TeachingStaff extends Staff {
     private String subject;
     private double result;

     public TeachingStaff(String n, int byear, double s, String sub, double res) {
          super(n, byear, s);
          subject = sub;
          result = res;
     }

     double salCalc() {
          return salary + (salary * (result / 1000));
     }

     public String toString() {
          return super.toString() + "\nSubject : " + subject + "\nNew Salary : " + salCalc();
     }
}

class NonTeachingStaff extends Staff {
     private String lab;
     private double exp;

     public NonTeachingStaff(String n, int byear, double s, String l, double expr) {
          super(n, byear, s);
          lab = l;
          exp = expr;
     }

     double ntsalCalc() {
          return salary + (salary * (exp / 100));
     }

     public String toString() {
          return super.toString() + "\nLab : " + lab + "\nNew Salary : " + ntsalCalc();
     }
}

class PersonTester {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int choice = Integer.parseInt(scan.nextLine());
          String name = scan.nextLine();
          int byear = Integer.parseInt(scan.nextLine());
          if (choice == 1) {
               String dept = scan.nextLine();
               double att = scan.nextDouble();
               Student b = new Student(name, byear, dept, att);
               System.out.println(b);
          } else if (choice == 2) {
               String sub = scan.nextLine();
               double result = scan.nextDouble();
               double sal = scan.nextDouble();
               TeachingStaff ts = new TeachingStaff(name, byear, sal, sub, result);
               System.out.println(ts);
          } else if (choice == 3) {
               String lab = scan.nextLine();
               double exp = scan.nextDouble();
               double sal = scan.nextDouble();
               NonTeachingStaff nts = new NonTeachingStaff(name, byear, sal, lab, exp);
               System.out.println(nts);
          }

          scan.close();

     }
}