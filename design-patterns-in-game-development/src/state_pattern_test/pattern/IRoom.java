package state_pattern_test.pattern;

public interface IRoom {
	public void userIn(User user);

	public void userOut(User user);

	public boolean canIn(User user);
}
