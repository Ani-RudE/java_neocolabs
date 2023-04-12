//Write a Java program that demonstrates operator overloading for adding numbers and concatenating strings
//StringWrapper.java
public class StringWrapper {
     private String value;

     public StringWrapper(String value) {
          this.value = value;
     }

     public StringWrapper add(StringWrapper str) {
          return new StringWrapper(this.value + str.value);
     }

     public String getValue() {
          return value;
     }
}