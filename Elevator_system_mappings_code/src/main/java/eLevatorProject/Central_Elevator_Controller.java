package eLevatorProject;

//Driver class
//Controller class
public class Central_Elevator_Controller {
	// class member variables
	private Local_Elevator_Controller elevator[];
	private boolean emergency_Button;
	private final int no_elevators = 2;	//	as there are two elevators given in project
	//Default constructor
	Central_Elevator_Controller(){
		//As there are two elevators in project description
		elevator = new Local_Elevator_Controller[no_elevators];
		for(int i=0; i< no_elevators; i++)
			elevator[i] =new Local_Elevator_Controller();
		emergency_Button = false;
	}
	// class methods
	public int get_elevator(int cf)
	{
		return Dispatcher.get_elevator( elevator , no_elevators ,cf);	
	}
	public void move_there(int lift,int cf)
	{
		elevator[lift].move_there(cf);
		Display.liftarrived(lift);
	}
	public void move_destination(int ele, int dest) 
	{
		elevator[ele].move_destination(dest);
		Display.liftreached();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// making 
		Central_Elevator_Controller cec =new Central_Elevator_Controller();
		User user = new User();
		int currentfloor = user.request_elevator();
		int appropriatelift = cec.get_elevator(currentfloor);
		cec.move_there(appropriatelift,currentfloor);
		//take input for floor choosing
		cec.move_destination(appropriatelift,user.choose_floor());
	}

};
