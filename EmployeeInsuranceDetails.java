import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsuranceDetails {
	
	public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery("SELECT AVG(Salary) FROM Employee");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	            System.out.print("Salary: " + rs.getInt("SELECT AVG(Salary) FROM Employee"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs1 = stmt.executeQuery("SELECT * FROM emp WHERE NOT (salary BETWEEN  1000 AND 2000)");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
	         // Extract data from result set
	         while (rs1.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs1.getInt("id"));
	            System.out.print(", Age: " + rs1.getInt("age"));
	            System.out.print(", First: " + rs1.getString("first"));
	            System.out.println(", Last: " + rs1.getString("last"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs2 = stmt.executeQuery("SELECT ID FROM employee UNION ALL SELECT ID FROM employee_details;");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
	         // Extract data from result set
	         while (rs2.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs2.getInt("ID"));
	           
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	      
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	 	         Statement stmt = conn.createStatement();
	 	         ResultSet rs3 = stmt.executeQuery("SELECT employee.employee _id,employee.first_name,department.department_name FROM employee CROSS JOIN department;");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
	 	         // Extract data from result set
	 	         while (rs3.next()) {
	 	            // Retrieve by column name
	 	            System.out.print("ID: " + rs3.getInt("id"));
	 	            System.out.print(", Department " + rs3.getInt("department_name"));
	 	            
	 	         }
	 	      } catch (SQLException e) {
	 	         e.printStackTrace();
	 	      } 
	      
	    
	}

}
