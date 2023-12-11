package sarthak;
import java.util.*;


class sart{
	void arthmeticException()
	{
		boolean valid;
		valid =false;
		while(!valid)
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number num1 & num2 : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			double c = num1/num2;
			System.out.println("Division is " + c+ "\n");
			valid = true;
		}
		catch(Exception e)
		{
			System.out.println("Invalid deno:\n\n");
		}
	}
	void ArrayOutOfBound(int[] arr)
	{
		boolean valid;
		valid = false;
		int i;
		while(!valid)
		{
			try{
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter the index to find elentmt: ");
				i = sc.nextInt();
				System.out.println("\n\nThis is array elemnt at index :" + i + "and element is " + arr[i]);
				valid = true;
			}
			catch(Exception e)
			{
				System.out.println(e + "\n\n");
			}
		}
	}
	
	void NumberFormat()
	{
		boolean valid;
		valid = false;
		while(!valid)
		try{
			Scanner  sc = new Scanner(System.in);
			System.out.print("Enter first number:: ");
			String num1=sc.next();
			System.out.print("Enter Second number:: ");
			String num2=sc.next();
			int a=Integer.parseInt(num1);//converting string to integer
			int b=Integer.parseInt(num2);//converting string to integer
			System.out.println("\nEntered Numbers are integers::"+a+" , "+b);
			valid=true;
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!!!");
			System.out.println(e + "\n\n");
		}
	
	}
}

public class Assignment7{
	public static void main(String[] args)
	{
		
		int ch=0;
		do {
			sart e = new sart();
			System.out.println("*****************************************");
			System.out.print("1.Arthimetic Exception");
			System.out.print("\t\t2.ArrayOUtOFBOund");
			System.out.print("\n3.Number format");
			System.out.print("\t\t\t4.Exit");
			System.out.println("\n*****************************************");

			System.out.println("Enter the input : \n");
			
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch(ch)
			{
				case 1 :
					e.arthmeticException();
					break;
				case 2:
					int arr[] = {20,40,50,60,70,77,97};
					e.ArrayOutOfBound(arr);
					break;
				case 3:
					e.NumberFormat();
					break;
				case 4:
					System.out.println("Visit again!!!");
					System.exit(0);
			}
		}while(ch<5);
	}

}