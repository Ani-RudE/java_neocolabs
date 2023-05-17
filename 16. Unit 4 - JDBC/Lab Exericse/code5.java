import java.util.Scanner;
import java.sql.*;

class Employee {
     public static void main(String args[]) throws Exception {
          String url = "jdbc:mysql://localhost/ri_db";
          String username = "test";
          String password = "test123";
          String query = "select *from employee where gender=? AND dept=?";
          Scanner sc = new Scanner(System.in);

          String gender = sc.nextLine();
          String dept = sc.nextLine();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, username, password);
          PreparedStatement st = con.prepareStatement(query);
          st.setString(1, gender);
          st.setString(2, dept);
          ResultSet rs = st.executeQuery();

          while (rs.next()) {
               System.out.println(
                         "Employee ID : " + rs.getInt(1) + " Name : " + rs.getString(3) + " " + rs.getString(4));
          }
     }
}