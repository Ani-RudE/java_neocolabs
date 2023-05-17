import java.util.Scanner;
import java.sql.*;

class Employee {
     public static void main(String args[]) throws Exception {
          String url = "jdbc:mysql://localhost/ri_db";
          String username = "test";
          String password = "test123";
          String query = "select *from student where dept=?";
          Scanner sc = new Scanner(System.in);

          String dept = sc.nextLine();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, username, password);
          PreparedStatement st = con.prepareStatement(query);
          st.setString(1, dept);
          ResultSet rs = st.executeQuery();

          while (rs.next()) {
               System.out.println(rs.getInt(1) + " " + rs.getString(2));
          }
     }
}