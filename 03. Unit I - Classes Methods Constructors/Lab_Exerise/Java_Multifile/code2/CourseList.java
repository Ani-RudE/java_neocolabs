//CourseList.java
public class CourseList {
     private Course[] courses = new Course[10];
     private int count = 0;

     public String addCourse(String name, int code) {
          if (count == courses.length) {
               return "Course list is full. Cannot add course.";
          }
          if (name.length() > 20) {
               return "Invalid name. Please enter a name with at most 20 characters.";
          }
          if (code <= 0) {
               return "Invalid code. Please enter a positive integer value for the course code.";
          }
          for (int i = 0; i < count; i++) {
               if (courses[i].getCode() == code) {
                    return "Course with the given code already exists. Cannot add course.";
               }
          }
          courses[count++] = new Course(name, code);
          return "Course added successfully.";
     }

     public String removeCourse(int code) {
          for (int i = 0; i < count; i++) {
               if (courses[i].getCode() == code) {
                    for (int j = i; j < count - 1; j++) {
                         courses[j] = courses[j + 1];
                    }
                    courses[--count] = null;
                    return "Course removed successfully.";
               }
          }
          return "Course not found.";
     }

     public void displayAllCourses() {
          if (count == 0) {
               System.out.println("No courses to display.");
          } else {
               System.out.println("All courses:");
               for (int i = 0; i < count; i++) {
                    System.out.println(courses[i].toString());
               }
          }
     }
}