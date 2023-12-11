//Problem Statement::
/*
Design and develop a context for given case study and implement an 
interface for Vehicles Consider the example of vehicles like bicycle,
car and bike. All Vehicles have common functionalities such as Gear Change,
Speed up and apply breaks. Make an interface and put all these common functionalities.
Bicycle, Bike, Car classes should be implemented for all these functionalities in their 
own class in their own way
*/

package sarthak;
import java.util.Scanner;

interface vehicle {
	void speed_up();
	void gear_change(int a);
	void apply_brake();
	void display();
}

class bicycle implements vehicle {
	int gear, speed;

	bicycle() {
		System.out.println("Bicycle Starts Successfully...");
		gear = 1;
		speed = 10;
		System.out.println("Your speed is " + speed);
	}

	public void speed_up() {
		if ((speed + 5) < 50) {
			speed = speed + 10;
			System.out.println("Your current speed is " + speed);
		} 
		else {
			System.out.println("Speed limit exceeds...");
		}
	}

	public void gear_change(int gearex) {
		if (gearex < 7 && gearex > 0) {
			gear = 1;
			gear = gear +1;
			System.out.println("Changing the gear...\nCurrent gear is " + gear + "th");
		} 
		else 
		{
			System.out.println("Gear is out of Range:...");
		}
	}
	

	public void apply_brake() {
		System.out.println("1.Decrease Speed\n2.Stop");
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x == 1) {
			speed = speed - 10;
			System.out.println("Your speed is decrease speed  " + speed);
		}
		if (x == 2) {
			gear = 0;
			speed = 0;
			System.out.println("Your speed is " + speed);
		}
	}
	
	public void display() {
		System.out.println("Current speed is " + speed + "\nGear is " + gear);
	}
}

class car implements vehicle {
	int gear, speed;

	car() 
	{
		System.out.println("Car Starts Successfully...");
		gear = 1;
		speed = 10;
		System.out.println("Your speed is " + speed);
	}

	public void speed_up() 
	{
		if ((speed + 5) < 50) 
		{
			speed = speed + 10;
			System.out.println("Your current speed is " + speed);
		} 
		else
		{
			System.out.println("Speed limit exceeds...");
		}
	}

	public void gear_change(int gearex) 
	{
		if (gearex < 7 && gearex > 0) {
			gear = 1;
			gear = gear +1;
			System.out.println("Changing the gear...\nCurrent gear is " + gear + "th");
		} 
		else 
		{
			System.out.println("Gear is out of Range:...");
		}
	}
	

	public void apply_brake() 
	{
		System.out.println("1.Decrease Speed\n2.Stop");
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x == 1) {
			speed = speed - 10;
			System.out.println("Your speed is decrease speed  " + speed);
		}
		if (x == 2) {
			gear = 0;
			speed = 0;
			System.out.println("Your speed is " + speed);
		}
		sc.close();
	}
	
	public void display() {
		System.out.println("Current speed is " + speed + "\nGear is " + gear);
	}
}

class bike implements vehicle {
	int gear, speed;

	bike() 
	{
		System.out.println("Bike Starts Successfully...");
		gear = 1;
		speed = 10;
		System.out.println("Your speed is " + speed);
	}

	public void speed_up() 
	{
		if ((speed + 5) < 50) {
			speed = speed + 10;
			System.out.println("Your current speed is " + speed);
		} 
		else {
			System.out.println("Speed limit exceeds...");
		}
	}

	public void gear_change(int gearex) {
		if (gearex < 7 && gearex > 0) 
		{
			gear = 1;
			gear = gear +1;
			System.out.println("Changing the gear...\nCurrent gear is " + gear + "th");
		} 
		else 
		{
			System.out.println("Gear is out of Range:...");
		}
	}
	

	public void apply_brake() {
		System.out.println("1.Decrease Speed\n2.Stop");
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x == 1) {
			speed = speed - 10;
			System.out.println("Your speed is decrease speed  " + speed);
		}
		if (x == 2) {
			gear = 0;
			speed = 0;
			System.out.println("Your speed is " + speed);
		}
		sc.close();
	}
	
	public void display() {
		System.out.println("Current speed is " + speed + "\nGear is " + gear);
	}
}


public class Assignment6
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		vehicle v =null;


		while(true) {
				
				System.out.println("************MENU*************");
				System.out.println("1.Bicycle");
				System.out.println("2.Car");
				System.out.println("3.Bike");
				System.out.println("****************************");
				
				System.out.print("Enter the choice which vehicle you want : ");
				int choice = sc.nextInt();
				System.out.println("\n******************************************");

				if(choice==1)
				{	
					System.out.println("Your the owner of the Bicycle ");
					int ch;
					do
					{
						System.out.println("\n******************************************");
						System.out.println("\t\t1.Start : ");
						System.out.println("\t\t2.Change the gear : ");
						System.out.println("\t\t3.Speed the vehicle : ");
						System.out.println("\t\t4.Apply the brake : ");
						System.out.println("\t\t5.Display the status : ");
						System.out.println("\t\t6.Exit : ");
						System.out.println("******************************************");
						
						System.out.println("Enter the choice : ");
						ch = sc.nextInt();
						switch(ch) 
						{
							case 1 :
								System.out.println("Starting Vehicle... ");
								v = new bicycle();
								break;
							case 2:
								System.out.println("Enter any key to Change the gear  ");
								int a = sc.nextInt();
								v.gear_change(a);
								break;
							case 3:
								System.out.println("Increasing your speed... ");
								v.speed_up();
								break;
								
							case 4:
								System.out.println("Applying the brake... ");
								v.apply_brake();
								break;
							
							case 5:
								System.out.println("Status Displaying...");
								v.display();
								break;
						}
					}while(ch<=5);
				}
				
				if(choice==2)
				{	
					System.out.println("Your the owner of the Car ");
					int ch;
					do
					{
						System.out.println("\n******************************************");
						System.out.println("\t\t1.Start : ");
						System.out.println("\t\t2.Change the gear : ");
						System.out.println("\t\t3.Speed the vehicle : ");
						System.out.println("\t\t4.Apply the brake : ");
						System.out.println("\t\t5.Display the status : ");
						System.out.println("\t\t6.Exit : ");
						System.out.println("******************************************");
						
						System.out.println("Enter the choice : ");
						ch = sc.nextInt();
						switch(ch) 
						{
							case 1 :
								System.out.println("Starting Vehicle... ");
								v = new car();
								break;
							case 2:
								System.out.println("Enter any key to Change the gear  ");
								int a = sc.nextInt();
								v.gear_change(a);
								break;
							case 3:
								System.out.println("Increasing your speed... ");
								v.speed_up();
								break;
								
							case 4:
								System.out.println("Applying the brake... ");
								v.apply_brake();
								break;
							
							case 5:
								System.out.println("Status Displaying...");
								v.display();
								break;
						}
					}while(ch<=5);
				}
				if(choice==3)
				{	
					System.out.println("Your the owner of the Bike ");
					int ch;
					do
					{
						System.out.println("\n******************************************");
						System.out.println("\t\t1.Start : ");
						System.out.println("\t\t2.Change the gear : ");
						System.out.println("\t\t3.Speed the vehicle : ");
						System.out.println("\t\t4.Apply the brake : ");
						System.out.println("\t\t5.Display the status : ");
						System.out.println("\t\t6.Exit : ");
						System.out.println("******************************************");
						
						System.out.println("Enter the choice : ");
						ch = sc.nextInt();
						switch(ch) 
						{
							case 1 :
								System.out.println("Starting Vehicle... ");
								v = new bike();
								break;
							case 2:
								System.out.println("Enter any key to Change the gear  ");
								int a = sc.nextInt();
								v.gear_change(a);
								break;
							case 3:
								System.out.println("Increasing your speed... ");
								v.speed_up();
								break;
								
							case 4:
								System.out.println("Applying the brake... ");
								v.apply_brake();
								break;
							
							case 5:
								System.out.println("Status Displaying...");
								v.display();
								break;
						}
					}while(ch<=5);
				}
		}
	}
}