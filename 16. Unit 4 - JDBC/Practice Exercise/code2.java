import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class RowInsertExample {
     public static void main(String args[]) throws Exception {
          String url = "jdbc:mysql://localhost/ri_db";
          String username = "test";
          String password = "test123";
          String query = "INSERT INTO STUDENT (id,name,average_marks) VALUES (?,?,?);";

          Scanner sc = new Scanner(System.in);

          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, username, password);
          PreparedStatement st = con.prepareStatement(query);

          int n = Integer.parseInt(sc.nextLine());

          for (int i = 0; i < n; i++) {
               int id = Integer.parseInt(sc.nextLine());
               String name = sc.nextLine();
               int average_marks = Integer.parseInt(sc.nextLine());
               st.setInt(1, id);
               st.setString(2, name);
               st.setInt(3, average_marks);
               st.executeUpdate();
          }

          ResultSet rs = st.executeQuery("select *from STUDENT");
          while (rs.next()) {
               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
          }
          st.close();
          con.close();
     }
}