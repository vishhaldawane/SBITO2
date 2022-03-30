package layer3;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import layer2.Friend;

public class TestDAOJDBC {

	//TDD
	FriendDAOJDBCImpl friendDAO = new FriendDAOJDBCImpl();
	
	@Test
	public void testFindAllFriends() {
		// TODO Auto-generated method stub
		
		//FriendDAOImpl friendDAO = new FriendDAOImpl();
		
		
		Assertions.assertTrue(friendDAO!=null);
		System.out.println("FriendDAO created...");

		ArrayList<Friend> allFriends = friendDAO.selectAllFriends();
		Assertions.assertTrue(allFriends.size() > 0 );
		System.out.println("friend list is non-empty...");
		
		for(Friend theFriend : allFriends) { // for each loop
			System.out.println("the friend : "+theFriend);
		}
		
	}
	
	
	@Test
	public void testFindSingleFriend()
	{
		
		//FriendDAOImpl friendDAO = new FriendDAOImpl();
	Assertions.assertTrue(friendDAO!=null);
		System.out.println("FriendDAO created...");
		
		Friend theFriend = friendDAO.selectFriend(105);
	Assertions.assertTrue(theFriend!=null);
		System.out.println("Friend found...");
	
		System.out.println("friend "+theFriend);
	}
	
	@Test
	public void testDeleteSingleFriend()
	{
		
	//	FriendDAOImpl friendDAO = new FriendDAOImpl();
	Assertions.assertTrue(friendDAO!=null);
		System.out.println("FriendDAO created...");
		
		friendDAO.deleteFriend(127);
		
		ArrayList<Friend> allFriends = friendDAO.selectAllFriends();
		Assertions.assertTrue(allFriends.size() > 0 );
		System.out.println("friend list is non-empty...");
		
		for(Friend theFriend : allFriends) { // for each loop
			System.out.println("the friend : "+theFriend);
		}
	

	}
	
	@Test 
	public void saveANewFriendTest() {
	//	FriendDAOImpl friendDAO = new FriendDAOImpl();
		Assertions.assertTrue(friendDAO!=null);
			System.out.println("FriendDAO created...");
			
		Friend newFriend = new Friend(130,"Java","Professional");
		friendDAO.insertFriend(newFriend);
		System.out.println("Friend is created....");
		
		ArrayList<Friend> allFriends = friendDAO.selectAllFriends();
		Assertions.assertTrue(allFriends.size() > 0 );
		System.out.println("friend list is non-empty...");
		
		for(Friend theFriend : allFriends) { // for each loop
			System.out.println("the friend : "+theFriend);
		}
	}
	
	@Test 
	public void updateAnExistingFriendTest() {
		//FriendDAOImpl friendDAO = new FriendDAOImpl();
		Assertions.assertTrue(friendDAO!=null);
			System.out.println("FriendDAO created...");
			
		Friend newFriend = new Friend(126,"JACKY","Professional");
		friendDAO.updateFriend(newFriend);
		System.out.println("Friend is updated....");
		
		ArrayList<Friend> allFriends = friendDAO.selectAllFriends();
		Assertions.assertTrue(allFriends.size() > 0 );
		System.out.println("friend list is non-empty...");
		
		for(Friend theFriend : allFriends) { // for each loop
			System.out.println("the friend : "+theFriend);
		}
	}
}
