import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//1. load the driver
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			//2. acquire the connection
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			//3. make a statement - insert query
			PreparedStatement pst = conn.prepareStatement("INSERT INTO FRIENDS VALUES(?,?,?)");
			
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			
			System.out.println("Enter friend id : ");			int fid = scan1.nextInt();
			System.out.println("Enter friend name : ");			String fnm = scan2.next();
			System.out.println("Enter friend type : ");			String ftyp = scan2.next();
			
			pst.setInt(1, fid);
			pst.setString(2, fnm);
			pst.setString(3, ftyp);
			
			//4. execute the statement and gain the result if any
			int rows = pst.executeUpdate();
			System.out.println("Rows inserted : "+rows);
			
			//5. close the statements, connection
			pst.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("Some sql problem : "+e);
		}
	}
		

}
