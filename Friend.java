

import java.util.Objects;

public class Friend {
	
	private int friendId;
	private String friendName;
	private String friendType;
	
	public Friend(int friendId, String friendName, String friendType) {
		super();
		this.friendId = friendId;
		this.friendName = friendName;
		this.friendType = friendType;
	}
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public String getFriendType() {
		return friendType;
	}
	public void setFriendType(String friendType) {
		this.friendType = friendType;
	}
	@Override
	public String toString() {
		return "Friend [friendId=" + friendId + ", friendName=" + friendName + ", friendType=" + friendType + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(friendId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return friendId == other.friendId;
	}
	
	
}
