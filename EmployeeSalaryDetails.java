import java.sql.*;

public class EmployeeSalaryDetails {

   String DB_URL_global = "jdbc:mysql://localhost/TUTORIALSPOINT";
   public void getSalaryDetails() {
      // Open a connection
	    String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
	    String USER = "guest";
	    String PASS = "guest123";
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT id, firstName, lastName FROM employee WHERE lastName LIKE '%sa';");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs1 = stmt.executeQuery("SELECT random();");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
         // Extract data from result set
         while (rs1.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 

      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs2 = stmt.executeQuery("SELECT INSTR('Melbourne, Australia', 'a', -1) into sal1 FROM DUAL;");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
         // Extract data from result set
         // while (rs2.next()) {
         //    // Retrieve by column name
         //    System.out.print("ID: " + rs1.getInt("id"));
         //    System.out.print(", Age: " + rs1.getInt("age"));
         //    System.out.print(", First: " + rs1.getString("first"));
         //    System.out.println(", Last: " + rs1.getString("last"));
         }
      
      catch (SQLException e) {
         e.printStackTrace();
      } 
   }

}
