import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Aircraft {
     Integer aircraftId;
     AircraftManufacturer aircraftManufacturerInstance;
     String model;

     public Aircraft() {
     }

     public Aircraft(Integer aircraftId, AircraftManufacturer aircraftManufacturerInstance, String model) {
          this.aircraftId = aircraftId;
          this.aircraftManufacturerInstance = aircraftManufacturerInstance;
          this.model = model;
     }

     public Integer getAircraftId() {
          return aircraftId;
     }

     public void setAircraftId(Integer aircraftId) {
          this.aircraftId = aircraftId;
     }

     public AircraftManufacturer getAircraftManufacturerInstance() {
          return aircraftManufacturerInstance;
     }

     public void setAircraftManufacturerInstance(AircraftManufacturer aircraftManufacturerInstance) {
          this.aircraftManufacturerInstance = aircraftManufacturerInstance;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

}

class AircraftDAO {
     ArrayList<String> listModels(String name) {

          // ResourceBundle rb = ResourceBundle.getBundle("mysql");

          String url = "jdbc:mysql://localhost/ri_db";
          String uname = "test";
          String pass = "test123";

          ArrayList<String> crafts = new ArrayList<String>();
          int aid = 0;
          try {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection(url, uname, pass);
               Statement s = con.createStatement();
               String sql1 = "select aircraft_manufacturer_id from aircraftManufacturer where name='" + name + "'";
               ResultSet rs1 = s.executeQuery(sql1);
               while (rs1.next()) {
                    aid = rs1.getInt("aircraft_manufacturer_id");
                    // System.out.println(aid);
               }
               String sql = "select model from aircraft where aircraft_manufacturer_id = '" + aid + "'";
               ResultSet rs = s.executeQuery(sql);
               while (rs.next()) {
                    String model = rs.getString(1);
                    crafts.add(model);
               }
          } catch (Exception e) {
               System.out.println(e);
          }
          return crafts;
     }
}

class AircraftManufacturer {
     Integer aircraftManufacturerId;
     String name;

     public AircraftManufacturer() {
     }

     public AircraftManufacturer(Integer aircraftManufacturerId, String name) {
          this.aircraftManufacturerId = aircraftManufacturerId;
          this.name = name;
     }

     public Integer getAircraftManufacturerId() {
          return aircraftManufacturerId;
     }

     public void setAircraftManufacturerId(Integer aircraftManufacturerId) {
          this.aircraftManufacturerId = aircraftManufacturerId;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

}

class Connect {
     public static Connection getConnection() throws ClassNotFoundException, SQLException {

          // ResourceBundle rb= ResourceBundle.getBundle("mysql");
          String url = "jdbc:mysql://localhost/ri_db";
          String uname = "test";
          String pass = "test123";
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url, uname, pass);
          return con;
     }
}

class Main {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String name = br.readLine();
          System.out.println("The models provided by " + name + " are :");
          AircraftDAO dao = new AircraftDAO();
          ArrayList<String> models = dao.listModels(name);
          for (String model : models) {
               System.out.println(model);
          }
     }
}