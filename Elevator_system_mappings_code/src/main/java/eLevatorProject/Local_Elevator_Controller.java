package eLevatorProject;

public class Local_Elevator_Controller {
	// member variables
	private Elevator elevator;
	// methods
	Local_Elevator_Controller()
	{
		elevator = new Elevator();
	}
	Elevator get_elevator()
	{
		return elevator;
	}
	public void move_there(int cf)
	{
		elevator.set_floor(cf);
		elevator.set_status(false);
		
	}
	public void move_destination(int dest)
	{
		elevator.set_floor(dest);
		elevator.set_status(true);
	}
	
};
