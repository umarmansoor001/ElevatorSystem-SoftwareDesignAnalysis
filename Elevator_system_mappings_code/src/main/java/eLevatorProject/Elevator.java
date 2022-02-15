package eLevatorProject;

public class Elevator {
	
	// member variables
	private int current_floor;
	private boolean status;
	// default constructor
	Elevator() {
		current_floor = 1; //Chooses 1st floor as a default place 
		status = true;		// status true of lift means lift is available  
	}
	// methods
	public int get_floor()
	{
		return current_floor;
	}
	public void set_floor(int floor)
	{
		current_floor = floor;
	}
	public boolean get_status()
	{
		return status;
	}
	public void set_status(boolean status)
	{
		this.status =  status;
	}
};
