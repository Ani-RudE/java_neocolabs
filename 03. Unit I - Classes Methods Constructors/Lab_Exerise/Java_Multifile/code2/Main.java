import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          CourseList courseList = new CourseList();
          while (true) {
               /*
                * System.out.println("\nCourse Management System\n");
                * System.out.println("1. Add course");
                * System.out.println("2. Remove course");
                * System.out.println("3. Display all courses");
                * System.out.println("4. Exit\n");
                * System.out.print("Enter your choice: ");
                */
               int choice = scanner.nextInt();
               switch (choice) {
                    case 1:
                         scanner.nextLine(); // Consume newline left-over
                         // System.out.print("\nEnter course name: ");
                         String name = scanner.nextLine();
                         // System.out.print("Enter course code: ");
                         int code = scanner.nextInt();
                         String result = courseList.addCourse(name, code);
                         System.out.println(result);
                         break;
                    case 2:
                         // System.out.print("\nEnter course code: ");
                         code = scanner.nextInt();
                         result = courseList.removeCourse(code);
                         System.out.println(result);
                         break;
                    case 3:
                         courseList.displayAllCourses();
                         break;
                    case 4:
                         System.exit(0);
                    default:
                         System.out.println("Invalid choice. Please enter a valid choice.");
               }
          }
     }
}