import java.sql.*;
import java.util.Scanner;

class StudentDetails {
     public static void main(String args[]) throws Exception {
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.nextLine());
          int count = 0;

          String url = "jdbc:mysql://localhost/ri_db";
          String uname = "test";
          String pass = "test123";

          String query = "insert into student values(?,?,?,?,?);";
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, uname, pass);
          for (int i = 0; i < n; i++) {
               int rollno = Integer.parseInt(sc.nextLine());
               String sname = sc.nextLine();
               int mark1 = Integer.parseInt(sc.nextLine());
               int mark2 = Integer.parseInt(sc.nextLine());
               int mark3 = Integer.parseInt(sc.nextLine());
               PreparedStatement st = con.prepareStatement(query);
               st.setInt(1, rollno);
               st.setString(2, sname);
               st.setInt(3, mark1);
               st.setInt(4, mark2);
               st.setInt(5, mark3);
               count = count + st.executeUpdate();
          }
          System.out.println(count);
          con.close();
     }
}