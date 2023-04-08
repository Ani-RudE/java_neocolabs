//Main.java
public class Main {
     public static void main(String[] args)
     {
          // Create a Person, Student, Employee, Faculty, and Staff objects
          Person person = new Person("John", "12 Bell street", "3473339999", "john12@aol.com");
          Student student = new Student("Mary", "100 Town Ave", "5149993333", "mary100@aol.com", "freshman");
          Employee employee = new Employee("Mike", "34 West street", "6189999999", "mike80@aol.com", 910, 60000);

          // Invoke toString of Person, Student, Employee, Faculty and Staff
          System.out.println(person.toString());
          System.out.println(student.toString());
          System.out.println(employee.toString());
     }
}