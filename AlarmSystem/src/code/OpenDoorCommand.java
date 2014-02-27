package code;

public class OpenDoorCommand implements Command {

	private Doors doors;
	
	public OpenDoorCommand(Doors doors) {
		this.doors = doors;
	}
	
	@Override
	public void execute() {
		doors.open();
	}

}
