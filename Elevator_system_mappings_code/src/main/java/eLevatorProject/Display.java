package eLevatorProject;

import java.util.Scanner;


//This class is only used to display on console 
public class Display {

	//Methods 
	static void Invalid_prompt()
	{
		System.out.println("******** Invalid Input *******");
		System.out.println("Again Enter:- ");
	}
	public static int take_floorinput() 
	{
		System.out.println("Choose Destination floor: ");
		System.out.println("Enter 1 for fisrt floor");
		System.out.println("Enter 2 for second floor");
		System.out.println("Enter 3 for third floor");
		int choice=0;
		Scanner input=new Scanner(System.in);
		do {
			try {
				choice=input.nextInt(); 
				if(choice<1 || choice>3)
					throw new OutofRangeException("Out of Range \n");
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
			}
		}while(choice<1 || choice>5);

		return choice;
	}
	public static void liftarrived(int lift)
	{
		System.out.println("Lift "+ (lift+1) +"has Arrived!");
		System.out.println("**************** Door is opening ***************");
		System.out.println("********** Please stepped into lift ************");
	}
	public static void liftreached()
	{
		System.out.println("****************** Door closing *******************");
		System.out.println("*************** Lift is Moving ****************");
		System.out.println("********* Lift has reached Destination *********");
		System.out.println("**************** Door is opening ***************");
		System.out.println("********** Please stepped out of lift ************");
		System.out.println("********** Thank you For Using ************");
	}
	static int request_lift()
	{
		System.out.println("Press 1 for UP Button");
		System.out.println("Press 2 for Down Button");
		Scanner input = new Scanner(System.in);
		int choice = 0;
		do {
			try {
				choice = input.nextInt();
				if(choice < 1 && choice > 2)
					throw new OutofRangeException("Out of Range \n");
		
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
			}
		}while(choice < 1 || choice > 2);
		
		//Now taking input of user's current floor
		System.out.println("Choose Your current floor");
		System.out.println("Enter 1 for fisrt floor");
		System.out.println("Enter 2 for second floor");
		System.out.println("Enter 3 for third floor");
		do {
			try {
				choice = input.nextInt();
				if(choice < 1 && choice > 3)
					throw new OutofRangeException("Out of Range \n");
		
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
			}
		}while(choice < 1 || choice > 3);
		
		System.out.println("Button Pressed!!!");
		System.out.println("******************* Please wait Lift is comming *********************");
		// returning current floor of user
		return choice;
	}
}
