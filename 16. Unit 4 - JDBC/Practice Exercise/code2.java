import java.sql.*;
import java.util.Scanner;

class LoginValidation {
     public static void main(String args[]) throws Exception {
          String url = "jdbc:mysql://localhost/ri_db";
          String username = "test";
          String password = "test123";
          String query = "select *from userdetails where user_name=?";
          Scanner sc = new Scanner(System.in);

          String user_name = sc.nextLine();
          String pass_word = sc.nextLine();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, username, password);
          PreparedStatement st = con.prepareStatement(query);
          st.setString(1, user_name);
          ResultSet rs = st.executeQuery();
          rs.next();
          // System.out.println(rs.getString(2));
          if (rs.getString(2).equals(pass_word)) {
               System.out.println("Login Successful");
          } else
               System.out.println("Invalid username/password");
     }
}