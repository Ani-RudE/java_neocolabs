//Suppose you are the manager of a retail store and you want to manage the details of your employees
// Person.java
public class Person {
     protected String name;
     protected int age;

     public Person(String name, int age) {
          this.name = name;
          this.age = age;
     }

     public void display() {
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
     }
}