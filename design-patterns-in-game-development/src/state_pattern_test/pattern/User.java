package state_pattern_test.pattern;

public class User {
	private int id;
	private IRoom room;

	public void inRoom(IRoom newRoom) {
		newRoom.userIn(this);
	}

	public void outRoom() {
		if(room != null){
			room.userOut(this);
		}
		inRoom(Hall.HALL_ROOM);
	}
	
	public void setRoom(IRoom room){
		this.room = room;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
