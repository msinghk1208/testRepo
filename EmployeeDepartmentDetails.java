import java.sql.*;

public class EmployeeDepartmentDetails {

   public static void main(String[] args) {
      // Open a connection
      // try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //    Statement stmt = conn.createStatement();
      //    ResultSet rs = stmt.executeQuery("SELECT employee.employee_id, employee.employee_name, department. department_name FROM employee INNER JOIN department ON employee.employee _id = department.employee _id");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
      //    // Extract data from result set
      //    while (rs.next()) {
      //       // Retrieve by column name
      //       System.out.print("ID: " + rs.getInt("employee_id"));
      //       System.out.print(", Age: " + rs.getInt("age"));
      //       System.out.print(", First: " + rs.getString("first_name"));
      //       System.out.println(", Dept name: " + rs.getString("department_name"));
      //    }
      // } catch (SQLException e) {
      //    e.printStackTrace();
      // } 
      // try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //    Statement stmt = conn.createStatement();
      //    ResultSet rs1 = stmt.executeQuery("SELECT employee.employee_id, employee.first_name, department.department_name FROM employee FULL OUTER JOIN department ON employee.employee _id = department.employee _id");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
      //    // Extract data from result set
      //    while (rs1.next()) {
      //       // Retrieve by column name
      //       System.out.print("ID: " + rs1.getInt("employee_id"));
      //       System.out.print(", First: " + rs1.getInt("first_name"));
      //       System.out.print(", Dept Name: " + rs1.getString("department_name"));
      //    }
      // } catch (SQLException e) {
      //    e.printStackTrace();
      // } 
      // try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //    Statement stmt = conn.createStatement();
      //    ResultSet rs2 = stmt.executeQuery("select * from employee where first_name like ‘A%d’");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
      //    // Extract data from result set
      //    while (rs2.next()) {
      //       // Retrieve by column name
      //       System.out.print("ID: " + rs2.getInt("id"));
      //       System.out.print(", Age: " + rs2.getInt("age"));
      //       System.out.print(", First: " + rs2.getString("first_name"));
      //       System.out.println(", Last: " + rs2.getString("last"));
      //    }
      // } catch (SQLException e) {
      //    e.printStackTrace();
      // } 
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    	         Statement stmt = conn.createStatement();
    	         ResultSet rs3 = stmt.executeQuery("select empno,ename,job,mgr,hiredate,sal,nvl(comm,0),deptno,city from emp");) {   //"stmt.executeQuery(QUERY1+QUERY2+QUERY3)"
    	         // Extract data from result set
    	         while (rs3.next()) {
    	            // Retrieve by column name
    	            System.out.print("ID: " + rs3.getInt("empno"));
    	            System.out.print(", Name: " + rs3.getString("ename"));
    	            System.out.print(", job: " + rs3.getString("job"));
    	            System.out.println(", Dept: " + rs3.getString("dept"));
    	            System.out.println(", mgr: " + rs3.getString("mgr"));
    	            System.out.println(", hiredate: " + rs3.getInt("hiredate"));
    	            System.out.println(", salary: " + rs3.getInt("sal"));
    	            System.out.println(", deptno: " + rs3.getInt("deptno"));
    	            System.out.println(", city: " + rs3.getString("city"));
    	            
    	         }
    	      } catch (SQLException e) {
    	         e.printStackTrace();
    	      } 



   }
}
