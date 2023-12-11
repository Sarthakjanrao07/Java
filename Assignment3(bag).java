package sarthak;

import java.util.Scanner;

class Bag
{
	private String col;
	private int wt;
	private static int total_ob;
	private static int total_wt;
	
	public Bag()
	{
		col = "RED";
		wt =10;		
		total_ob = total_ob+1;
		total_wt = total_wt+1;
	}
	
	public Bag(String col,int wt)
	{
		this.col = col;
		this.wt =wt;
		total_ob = total_ob+1;
		total_wt = total_wt+1;
	}
	
	public Bag(String col)
	{
		this.col = col;
		wt =10;
		total_ob = total_ob+1;
		total_wt = total_wt+1;
	}
	
	public Bag(int wt)
	{
		this.col = col;
		this.wt =wt;
		total_ob = total_ob+1;
		total_wt = total_wt+1;
	}
	
	public void display(int i)
	{
		System.out.println(i + "\t" + col + "\t" + wt);
	}
	
	public static void output()
	{
		System.out.println("total_ob " + "\t" + total_ob + "\t" + "total_wt" + total_wt);
	}
	
	public static void delete(Bag[] ob,int n)
	{
		Scanner sc =new Scanner(System.in);
		int delete;
		delete = sc.nextInt();
		total_wt = total_wt - ob[delete - 1].wt;
		
		for(int i=0;i<n;i++)
		{
			ob[i-1] = ob[i];
		}
		System.out.println("total_object: " + total_ob +"\t" + "total_weight: " + total_wt );
	}
}

public class Assignment3{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Bag obj[] = new Bag[10];
		int ch,w,n,m=0;
		String c;
		do
		{
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Exit\n");
			System.out.print("Enter the main menu option: ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				do
				{
					System.out.println("1.Default");
					System.out.println("2.default color and input wt");
					System.out.println("3.input color and default wt");
					System.out.println("4.Both input color and wt");
					System.out.println("5.Exit\n");
					System.out.print("Enter the submenu option: ");
					n = sc.nextInt();
					switch(n)
					{
						case 1:
							System.out.println("**********************");
							obj[n] = new Bag();
							n=n+1;
							System.out.println("Both are Added...");
							break;
						case 2:
							System.out.println("**********************");
							System.out.println("Enter the weight: ");
							w = sc.nextInt();
							obj[n]=new Bag(w);
							System.out.println("Ball is Addded...");
							break;
						case 3:
							System.out.println("**********************");
							System.out.println("Enter the color input: ");
							c =sc.next();
							obj[n]=new Bag(c);
							System.out.println("Ball is Addded...");
							break;
						case 4:
							System.out.println("**********************");
							System.out.println("Enter the color input: ");
							c =sc.next();
							System.out.println("Enter the weight: ");
							w = sc.nextInt();
							obj[n]=new Bag(c,w);
							System.out.println("Ball is Addded...");
							break;
						case 5:
							System.out.println("Exit");
					}
					
				}while(n!=5);
				break;
			case 2:
				
				System.out.println("**********Display************");
				for(int i=0;i<m;i++)
				{
					obj[i].display(i); 
				}
				Bag.output();
				System.out.println("******************************");
				break;
			case 3:
				System.out.println("**********Delete************");
				Bag.delete(obj,m);
				System.out.println("*****************************");
				break;
			case 4:
				System.out.println("*********Exited Successfully*********");
				System.exit(0);
			}
		}while(ch!=4);
	}
}