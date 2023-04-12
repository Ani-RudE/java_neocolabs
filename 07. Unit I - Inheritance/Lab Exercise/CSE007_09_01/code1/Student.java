//Design a class named Person
//Student.java
public class Student extends Person
{
     private String status;

     public Student(String name, String address, String phone, String email, String status)
               {
                    super(name, address, phone, email);
                    this.status = status;
               }

     /** Set new status */
     public void setStatus(String status) {
          this.status = status;
     }

     /** Return status */
     public String getStatus()
     {
          return status;
     }

     /** Return a string discription of the class */
     public String toString()
     {
          return super.toString() + "\nStatus: " + getStatus();
     }
}