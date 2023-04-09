//Write a Java program that demonstrates operator overloading for adding numbers and concatenating strings
//Number.java
public class Number {
     private int value;

     public Number(int value) {
          this.value = value;
     }

     public Number add(Number num) {
          return new Number(this.value + num.value);
     }

     public int getValue() {
          return value;
     }
}