import java.sql.*;
import java.util.*;

class EmployeeDetails {
     public static void main(String[] args) throws Exception {
          String url = "jdbc:mysql://localhost/ri_db";
          String username = "test";
          String password = "test123";
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, username, password);
          String query = "select * from EMPLOYEE where salary>=?";
          Scanner sc = new Scanner(System.in);
          double s1 = sc.nextDouble();
          PreparedStatement st = con.prepareStatement(query);
          st.setDouble(1, s1);
          ResultSet rs = st.executeQuery();
          while (rs.next()) {
               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));
          }
          st.close();
          con.close();
     }
}