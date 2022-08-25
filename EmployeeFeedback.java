import java.sql.*;

public class EmployeeFeedback {

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("select LOCALTIMESTAMP;");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("Date: " + rs.getInt("sysdate"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs1 = stmt.executeQuery("SELECT ABS(-87) \"Absolute\" FROM DUAL");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
         // Extract data from result set
         while (rs1.next()) {
            // Retrieve by column name
            System.out.print("Abs: " + rs1.getInt("ABS(-87) \"Absolute\""));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs2 = stmt.executeQuery("select LAST_DAY(sysdate) from dual");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
         // Extract data from result set
         while (rs2.next()) {
            // Retrieve by column name
            System.out.print("Last_day: " + rs2.getInt("LAST_DAY(sysdate)"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    	         Statement stmt = conn.createStatement();
    	         ResultSet rs3 = stmt.executeQuery("select floor(3.456) \"Floor\" from dual");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
    	         // Extract data from result set
    	         while (rs3.next()) {
    	            // Retrieve by column name
    	            System.out.print("floor: " + rs3.getInt("floor(3.456)"));
    	            
    	         }
    	      } catch (SQLException e) {
    	         e.printStackTrace();
    	      } 



   }
}
