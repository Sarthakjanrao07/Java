package sarthak;

import java.util.*;
abstract class Car_Factory{
	String company,car_name;
	double budget;
	
	abstract void getprice(double price);
	abstract void detail(String company,String car_name);
	abstract void accessories();
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Company-> "	);
		company = sc.next();
		System.out.println("Car_name-> ");
		car_name = sc.next();
		System.out.println("Budget-> ");
		budget = sc.nextDouble();
	}
	
	void display(Car_Factory ob)
	{
		ob.getprice(budget);
		System.out.println("\n-----------------------------------");
		ob.detail(company,car_name);
		System.out.println("\n-----------------------------------");
		ob.accessories();
		System.out.println("\n-----------------------------------");
	}
}

class Small_car extends Car_Factory
{
	void getprice(double price)
	{
		if(price>2 && price <5)
		{
			System.out.println("This car is in this price range: ");
		}
		else
		{
			System.out.println("Your budget is not suitable: ");
		}
	}
	
	public void detail(String company,String car_name)
	{
		System.out.println("Company -> " + company);
		System.out.println("Name of car -> " + car_name);
		System.out.println("Fuel-> petrol");
	}
	
	public void accessories()
	{
		System.out.println("Airbag Available " );
		System.out.println("Auto-pilot ");
	}
}

class Sedan extends Car_Factory
{
	void getprice(double price)
	{
		if(price>2 && price <5)
		{
			System.out.println("This car is in this price range: ");
		}
		else
		{
			System.out.println("Your budget is not suitable: for :  ");
		}
	}
	
	public void detail(String company,String car_name)
	{
		System.out.println("Company -> " + company);
		System.out.println("Name of car -> " + car_name);
		System.out.println("Fuel-> petrol");
	}
	
	public void accessories()
	{
		System.out.println("Airbag Available " );
		System.out.println("Auto-pilot ");
	}
}


class SUV extends Car_Factory
{
	void getprice(double price)
	{
		if(price>2 && price <5)
		{
			System.out.println("This car is in this price range: ");
		}
		else
		{
			System.out.println("Your budget is not suitable: ");
		}
	}
	
	public void detail(String company,String car_name)
	{
		System.out.println("Company -> " + company);
		System.out.println("Name of car -> " + car_name);
		System.out.println("Fuel-> petrol");
	}
	
	public void accessories()
	{
		System.out.println("Airbag Available " );
		System.out.println("Auto-pilot ");
	}
}



public class Assignment9 {
	public static void main(String args[])
	{
		Car_Factory ob;
		int ch;
		do {
			System.out.print("1.Small car : ");
			System.out.println("\t\t2.Sedan ");
			System.out.print("3.SUV");
			System.out.print("\t\t\t4.Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\nEnter the choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("This is your 1 choice for small car");
					ob = new Small_car();
					ob.input();
					ob.display(ob);
					break;
				case 2:
					System.out.println("This is your 2 choice for Sedan");
					ob = new Sedan();
					ob.input();
					ob.display(ob);
					break;
				case 3:
					System.out.println("This is your 3 choice for SUV");
					ob = new Sedan();
					ob.input();
					ob.display(ob);
					break;
				case 4:
					System.exit(0);
			}
		}while(ch!=2);
	}
}

