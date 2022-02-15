package eLevatorProject;

public class Dispatcher {

	public static int get_elevator(Local_Elevator_Controller[] El, int size, int cf)
	{
		for(int i =0; i < size; i++)
		{
			if(El[i].get_elevator().get_status())
				return i;	//returns lift number
		}
		return 0;
	}
}
