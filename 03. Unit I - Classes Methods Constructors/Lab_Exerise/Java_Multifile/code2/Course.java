//Course.java
public class Course {
     private String name;
     private int code;

     public Course(String name, int code) {
          this.name = name;
          this.code = code;
     }

     public String getName() {
          return name;
     }

     public int getCode() {
          return code;
     }

     public String toString() {
          return "Course code: " + code + ", Name: " + name;
     }
}