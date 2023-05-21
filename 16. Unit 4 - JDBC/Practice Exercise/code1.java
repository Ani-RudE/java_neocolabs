import java.sql.*;

class StudentDetails {
     public static void main(String args[]) throws Exception {
          String url = "jdbc:mysql://localhost/ri_db";
          String uname = "test";
          String pass = "test123";
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, uname, pass);

          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery("select *from student");
          while (rs.next()) {
               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4) + " "
                         + rs.getInt(5));

          }
          st.close();
          con.close();
     }
}