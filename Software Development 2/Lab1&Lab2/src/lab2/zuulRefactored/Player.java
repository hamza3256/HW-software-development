package lab2.zuulRefactored;

public class Player {
	
	Room currentRoom;
	String Pname;
	

	public Player(String name) {
		Pname = name;
	}
	
	public void setPlayerRoom(Room room) {
		currentRoom = room;
	}
	
	public Room getPlayerRoom() {
		return currentRoom;
	}

	public String getPlayerName() {
		// TODO Auto-generated method stub
		return Pname;
	}

	
	
}
	
