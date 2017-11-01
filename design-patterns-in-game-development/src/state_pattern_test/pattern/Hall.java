package state_pattern_test.pattern;

public class Hall implements IRoom {
	
	public static final Hall HALL_ROOM = new Hall();

	public void userIn(User user) {
		// TODO Auto-generated method stub

	}

	public void userOut(User user) {
		// TODO Auto-generated method stub

	}

	public boolean canIn(User user) {
		// TODO Auto-generated method stub
		return false;
	}
}
