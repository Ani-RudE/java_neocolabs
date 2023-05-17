import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class RowDelete {
     public static void main(String args[]) throws Exception {
          String url = "jdbc:mysql://localhost/ri_db";
          String username = "test";
          String password = "test123";
          String query = "delete from student where dept =? AND cgpa > ?;";

          Scanner sc = new Scanner(System.in);

          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, username, password);
          PreparedStatement st = con.prepareStatement(query);

          String dept = sc.nextLine();
          double cgpa = Double.parseDouble(sc.nextLine());
          st.setString(1, dept);
          st.setDouble(2, cgpa);
          st.execute();

          ResultSet rs = st.executeQuery("select *from student");
          while (rs.next()) {
               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
                         + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8)
                         + " " + rs.getString(9));
          }
          st.close();
          con.close();
     }
}