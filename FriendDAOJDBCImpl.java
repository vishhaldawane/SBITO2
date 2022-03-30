package layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import layer2.Friend;

public class FriendDAOJDBCImpl implements FriendDAO {

	ArrayList<Friend> friendList = new ArrayList<Friend>();
	
	Connection conn;
	
	public FriendDAOJDBCImpl() { //simulation of the DB
		System.out.println("FriendDAOJDBCImpl() ctor...");	
		try
		{
			//1. load the driver
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			//2. acquire the connection
			this.conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			//3. make a statement
			Statement st = 	conn.createStatement();
			//4. execute the statement and gain the result if any
			ResultSet result = st.executeQuery("SELECT * FROM friends");
			//5 process the result if any
			while(result.next()) {
				int x = result.getInt(1);
				String y = result.getString(2);
				String z = result.getString(3);
				Friend friend = new Friend(x,y,z);
				friendList.add(friend);
			}
		}
		catch(SQLException e) {
			System.out.println("Some sql problem : "+e);
		}
	}
	
	@Override
	public void insertFriend(Friend friend) {
		System.out.println("FriendDAOJDBCImpl : insertFriend(int)");
		try {
			PreparedStatement pst = conn.prepareStatement("INSERT INTO FRIENDS VALUES(?,?,?)");
			pst.setInt(1, friend.getFriendId());
			pst.setString(2, friend.getFriendName());
			pst.setString(3, friend.getFriendType());
			//4. execute the statement and gain the result if any
			int rows = pst.executeUpdate();
			System.out.println("Rows inserted : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateFriend(Friend friend) {
		//4. execute the statement and gain the result if any
		int rows;
		try {
			System.out.println("FriendDAOImpl : updateFriend(int)");
			PreparedStatement pst = conn.prepareStatement("UPDATE FRIENDS SET FRIEND_NAME=?, FRIEND_TYPE=? WHERE FRIEND_ID=?");
			pst.setString(1, friend.getFriendName());
			pst.setString(2, friend.getFriendType());
			pst.setInt(3, friend.getFriendId());
			rows = pst.executeUpdate();
			System.out.println("Rows UPDATED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteFriend(int friendId) {
		System.out.println("FriendDAOImpl : deleteFriend(int)");
		try {
			//3. make a statement - insert query
			PreparedStatement pst = conn.prepareStatement("delete from FRIENDS where friend_id=?");
			pst.setInt(1, friendId);	
			//4. execute the statement and gain the result if any
			int rows = pst.executeUpdate();
			System.out.println("Rows deleted : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Friend selectFriend(int friendId) {
		System.out.println("FriendDAOImpl : selectFriend(int)");
		Friend friend = null;
		
		
		try {
			Statement st = 	conn.createStatement();
			//4. execute the statement and gain the result if any
			ResultSet result = st.executeQuery("SELECT * FROM friends where friend_id="+friendId);
			
			if(result.next()) {
				int x = result.getInt(1);
				String y = result.getString(2);
				String z = result.getString(3);
				friend = new Friend(x,y,z);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return friend;
	}

	@Override
	public ArrayList<Friend> selectAllFriends() {
		System.out.println("FriendDAOImpl : selectAllFriends()");
		return friendList;
	}

}
