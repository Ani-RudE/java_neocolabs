class Animal{
     void walk()
     {
          System.out.println("I am walking");
     }
}

class Bird extends Animal{
     void fly()
     {
          System.out.println("I am flying");
     }
}

class Human extends Bird{
     void sing()
     {
          System.out.println("I am singing");
     }
}

class Main {
     public static void main(String[] args)
     {
          Human obj=new Human();
          obj.walk();
          obj.fly();
          obj.sing();
     }
}