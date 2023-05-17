import java.sql.*;
import java.util.Scanner;

class Stall {
     int id;
     String name;
     Double deposit;

     public Stall() {
          super();
     }

     public Stall(int id, String name, Double deposit) {
          super();
          this.id = id;
          this.name = name;
          this.deposit = deposit;
     }

}

class StallBO {
     public Stall getStall(int id) throws Exception {
          String url = "jdbc:mysql://localhost/ri_db";
          String username = "test";
          String password = "test123";
          Class.forName("com.mysql.jdbc.Driver");
          String query = "select *from Stall where id=" + id;

          Connection con = DriverManager.getConnection(url, username, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(query);

          rs.next();
          String name = rs.getString(2);
          Double deposit = rs.getDouble(3);
          Stall s = new Stall();
          s.id = id;
          s.name = name;
          s.deposit = deposit;
          return s;
     }
}

class Main {
     public static void main(String args[]) throws Exception {
          StallBO sbo = new StallBO();
          Scanner sc = new Scanner(System.in);
          int id = Integer.parseInt(sc.nextLine());

          Stall S1 = sbo.getStall(id);
          System.out.format("%-10s %-10s %-10s\n", "ID", "Name", "Deposit");
          System.out.format("%-10s %-10s %-10s\n", S1.id, S1.name, S1.deposit);
     }
}