import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//1. load the driver
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			//2. acquire the connection
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			//3. make a statement - insert query
			PreparedStatement pst = conn.prepareStatement("delete from FRIENDS where friend_id=?");
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter friend id to delete : ");			
			int fid = scan1.nextInt();
			pst.setInt(1, fid);
			
			//4. execute the statement and gain the result if any
			int rows = pst.executeUpdate();
			System.out.println("Rows deleted : "+rows);
			
			//5. close the statements, connection
			pst.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("Some sql problem : "+e);
		}
	}
		

}
