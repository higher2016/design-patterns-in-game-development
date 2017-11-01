package state_pattern_test.pattern;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Room1 implements IRoom {
	public static final IRoom ROOM_1 = new Room1();

	private Map<Integer, User> allUsers = new ConcurrentHashMap<Integer, User>();

	private final int maxUserNum = 100;

	private Set<Integer> canInRoomUserIds = new HashSet<Integer>();

	public void userIn(User user) {
		if(canIn(user)){
			allUsers.put(user.getId(), user);
			// 为什么要把User转换Room的代码放在这而不是移回到User类中,详细解释看
			// state_pattern_test/pattern/ContextSetState.txt文件
			user.setRoom(this);
		}
	}

	public void userOut(User user) {
		allUsers.remove(user.getId());
		user.setRoom(null);
	}

	public boolean canIn(User user) {
		if (allUsers.size() > maxUserNum) {
			return false;
		}
		if (canInRoomUserIds.contains(user.getId())) {
			return true;
		}
		return false;
	}
}
