package code;

public class CloseDoorCommand implements Command {

	private Doors doors;
	
	public CloseDoorCommand(Doors doors) {
		this.doors = doors;
	}
	
	@Override
	public void execute() {
		doors.close();
	}

}
