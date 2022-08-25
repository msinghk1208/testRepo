import java.sql.*;

public class EmployeeFamilyDetails {
	public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery("SELECT COUNT(ID),first FROM employee GROUP BY first HAVING COUNT(ID)> 100002");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	            System.out.print("Total Id " + rs.getInt("SELECT COUNT(ID),first FROM employee GROUP BY first HAVING COUNT(ID)> 100002"));
	            
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs1 = stmt.executeQuery("SELECT ID,last_name,first_name FROM employee WHERE first_name <> 'John' INTERSECT SELECT customer_id,last_name,first_name FROM customers WHERE customer_id >= 89;");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
	         // Extract data from result set
	         while (rs1.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs1.getInt("ID"));
	           System.out.print(", First: " + rs1.getString("first_name"));
	            System.out.println(", Last: " + rs1.getString("last_name"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs2 = stmt.executeQuery("SELECT * FROM emp  WHERE ename NOT IN  ('SCOTT', 'SMITH')");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
	         // Extract data from result set
	         while (rs2.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs2.getInt("id"));
	            System.out.print(", Age: " + rs2.getInt("age"));
	            System.out.print(", First: " + rs2.getString("first"));
	            System.out.println(", Last: " + rs2.getString("last"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	      
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	 	         Statement stmt = conn.createStatement();
	 	         ResultSet rs3= stmt.executeQuery("select extract(year from sysdate) from dual");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
	 	         // Extract data from result set
	 	         while (rs3.next()) {
	 	            // Retrieve by column name
	 	            System.out.print("New-Query " + rs3.getString("select extract(year from sysdate) from dual"));
	 	            
	 	         }
	 	      } catch (SQLException e) {
	 	         e.printStackTrace();
	 	      } 
	      
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		 	         Statement stmt = conn.createStatement();
		 	         ResultSet rs4 = stmt.executeQuery("select CURRENT_TIMESTAMP;") {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
		 	         // Extract data from result set
		 	         while (rs4.next()) {
		 	            // Retrieve by column name
		 	        	 System.out.print("New-Query:" + rs4.getString("select CURRENT_TIMESTAMP;"));:
		 	         }
		 	      } catch (SQLException e) {
		 	         e.printStackTrace();
		 	      } 
	}
}
	

	

	  

