package eLevatorProject;

public class User {
	// class member variables
	private int current_floor;
	private int selected_floor;
	// class methods
	public int request_elevator()
	{
		current_floor = Display.request_lift();
		return current_floor;
	}
	public int choose_floor()
	{
		selected_floor = Display.take_floorinput();
		return selected_floor;
	}
};
