//Overloading the main function
class Main {
     public static void main(String s) {
          System.out.println("Overloaded: " + s);
     }

     public static void main(String s1, String s2) {
          System.out.println("Overloaded: " + s1 + " & " + s2);
     }

     public static void main(String args[]) {
          System.out.println("Hi");
          Main.main("Hello World");
          Main.main("Tom", "Jerry");
     }
}