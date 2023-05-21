import java.sql.*;
import java.util.Scanner;

class JDBCExample {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     static final String DB_URL = "jdbc:mysql://localhost/ri_db";

     static final String USER = "test";
     static final String PASS = "test123";

     public static void main(String[] args) {
          Connection conn = null;
          Connection myConn = null;
          Statement stmt = null;
          PreparedStatement st = null;
          try {
               Class.forName("com.mysql.jdbc.Driver");
               conn = DriverManager.getConnection(DB_URL, USER, PASS);
               stmt = conn.createStatement();
               String sql;
               Scanner sc = new Scanner(System.in);
               int n = Integer.parseInt(sc.nextLine());
               for (int i = 0; i < n; i++) {
                    int sid = Integer.parseInt(sc.nextLine());
                    String sname = sc.nextLine();
                    String dname = sc.nextLine();
                    String address = sc.nextLine();
                    double gpa = Double.parseDouble(sc.nextLine());
                    sql = "insert into BILL (sid,sname,dname,address,gpa) values(?,?,?,?,?)";
                    st = conn.prepareStatement(sql);

                    st.setInt(1, sid);
                    st.setString(2, sname);
                    st.setString(3, dname);
                    st.setString(4, address);
                    st.setDouble(5, gpa);

                    st.execute();
               }

               String search = sc.nextLine();
               sql = "SELECT * FROM BILL Where DNAME='" + search + "'";
               ResultSet rs = stmt.executeQuery(sql);
               int count = 0;
               while (rs.next()) {
                    count++;
                    int sid = rs.getInt("SID");
                    String sName = rs.getString("SNAME");
                    String dName = rs.getString("DNAME");
                    String address = rs.getString("ADDRESS");
                    double gpa = rs.getDouble("GPA");
                    System.out.format("%s %s %s %s %s\n", sid, sName, dName, address, gpa);
               }
               if (count == 0)
                    System.out.println("No students in " + search + " department");

          } catch (SQLException se) {

               se.printStackTrace();
          } catch (Exception e) {

               e.printStackTrace();
          } finally {

               try {
                    if (stmt != null)
                         conn.close();
               } catch (SQLException se) {
               }
               try {
                    if (conn != null)
                         conn.close();
               } catch (SQLException se) {
                    se.printStackTrace();
               }
          }
     }
}