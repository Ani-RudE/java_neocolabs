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