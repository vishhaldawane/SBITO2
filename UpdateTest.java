import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//1. load the driver
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			//2. acquire the connection
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			//3. make a statement - insert query
			PreparedStatement pst = conn.prepareStatement("UPDATE FRIENDS SET FRIEND_NAME=?, FRIEND_TYPE=? WHERE FRIEND_ID=?");
			
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			
			System.out.println("Enter friend id : ");			int fid = scan1.nextInt();
			System.out.println("Enter friend name : ");			String fnm = scan2.next();
			System.out.println("Enter friend type : ");			String ftyp = scan2.next();
			
			
			pst.setString(1, fnm);
			pst.setString(2, ftyp);
			pst.setInt(3, fid);
			
			//4. execute the statement and gain the result if any
			int rows = pst.executeUpdate();
			System.out.println("Rows UPDATED : "+rows);
			
			//5. close the statements, connection
			pst.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("Some sql problem : "+e);
		}
	}
		

}
