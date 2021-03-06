import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//1. load the driver
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			//2. acquire the connection
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			//3. make a statement
			Statement st = 	conn.createStatement();
			
			//4. execute the statement and gain the result if any
			ResultSet result = st.executeQuery("SELECT * FROM EMP");
			
			//5 process the result if any
			while(result.next()) {
				int x = result.getInt(1);
				String y = result.getString(2);
				String z = result.getString(3);
				//Friend f = new Friend(x,y,z);
				System.out.println("FRIEND ID   : "+x); //f.getFriendId());
				System.out.println("FRIEND NAME : "+y); //f.getFriendName());
				System.out.println("FRIEND TYPE : "+z); //f.getFriendType());
				System.out.println("------------------------------");
			}
			//6. close the statements, connection
			st.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("Some sql problem : "+e);
		}
	}
		

}
