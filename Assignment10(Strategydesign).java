package sarthak;
import java.util.*;

interface Paymentprocess
{
	void pay(int amount);
}

class Creditcard implements Paymentprocess
{
	Scanner sc  = new Scanner(System.in);
	String name;
	int expdate;
	double cardno;
	
	Creditcard()
	{
		super();
		System.out.println("Enter the name : ");
		name = sc.next();
		System.out.println("Enter the expadate : ");
		expdate = sc.nextInt();
		System.out.println("Enter the card no : ");
		cardno = sc.nextDouble();
	}
	public void pay(int amount)
	{
		System.out.println("*********************");
		System.out.println("Amount payable is  : $" + amount);
		System.out.println("**********************");
	}
}

class Paypal implements Paymentprocess
{
	Paypal()
	{
		super();
		System.out.println("Checking the Internet connections : ");
	}
	public void pay(int amount)
	{
		System.out.println("*********************");
		System.out.println("Amount payavble is $:" + amount );
		System.out.println("**********************");
	}
}

class Bitcoin implements Paymentprocess
{
	Scanner sc  = new Scanner(System.in);
	String add;
	
	Bitcoin()
	{
		super();
		System.out.println("Enter the address to transact : ");
		add = sc.next();
		System.out.println("Checking the Internet connections : ");
	}
	public void pay(int amount)
	{
		System.out.println("*********************");
		System.out.println("Amount payavble is $:" + amount );
		System.out.println("**********************");
	}
}

class Order{
	private final Paymentprocess paymentprocess;
	private final int amount;
	
	public Order(int amount,Paymentprocess paymentprocess) 
	{
		this.amount = amount;
		this.paymentprocess = paymentprocess;
	}
	public void process()
	{
		paymentprocess.pay(amount);
	}
}

public class Assignment10
{
	public static void main(String args[])
	{
		int c,amt=0;
		Order order;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("***************************");
			System.out.println("1.CC\n2.PAYPAL \n3.BITCOIN\n4.EXIT");
			System.out.println("***************************");
			
			System.out.println("Enter the choice : ");
			c=sc.nextInt();
			
			
				if(c==1||c==2||c==3)
				{
					System.out.println("Enter the amount to tranfer : ");
					amt = sc.nextInt();
				}
				switch(c)
				{
					case 1:
						order = new Order(amt,new Creditcard());
						order.process();
						break;
					case 2:
						order = new Order(amt,new Paypal());
						order.process();
						break;
					
					case 3:
						order = new Order(amt,new Bitcoin());
						order.process();
						break;
						
					case 4:
						System.exit(0);
						
				}
			}
	}
}

