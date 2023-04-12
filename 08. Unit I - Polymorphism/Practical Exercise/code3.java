//Write two subclasses named Dog and Cat
class Animal {

     void Print() {
          System.out.println("Animal");
     }
}

class Dog extends Animal {

     void Print() {
          System.out.println("Dog");
     }
}

class Cat extends Animal {

     void Print() {
          System.out.println("Cat");
     }
}

class Main {
     public static void main(String[] args) {

          Animal a;

          a = new Dog();
          a.Print();

          a = new Cat();
          a.Print();
     }
}