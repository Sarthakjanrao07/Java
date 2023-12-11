package sarthak;
import java.util.ArrayList;
import java.util.*;

class Number{
	private ArrayList <Integer>list = new ArrayList<>(); 
	private ArrayList<Integer>even = new ArrayList<>();
	private ArrayList<Integer>odd = new ArrayList<>();
	private ArrayList<Integer>prime =new ArrayList<>();
	private ArrayList<String>string = new ArrayList<>();
	private ArrayList<String>pali = new ArrayList<>();
	
	
	public void GetData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of elemnet you want : ");
		int element = sc.nextInt();
		for(int i=0;i<element;i++)
		{
			System.out.println("Enter elemnets: ");
			int num =sc.nextInt();
			list.add(num);
		}
	}
	
	public void evenOdd()
	{
		for(int i=0;i<list.size();i++) 
		{
			if((list.get(i))%2==0)
			{
				even.add(list.get(i));
			}
			else
			{
				odd.add(list.get(i));
			}
		}
	}
	
	public void prime()
	{
		int flag=0;
		for(int i=0;i<list.size();i++)
		{
			for(int j=2;j<list.get(i);j++)
			{
				if(list.get(i)%j==0)
				{
					flag=1;
					break;
				}
				if(flag==1)
				{
					prime.add(list.get(i));
				}
				break;
			}
		}
	}
	
	public void setString()
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Enter the string : " + i);
			String s = sc.next();
			string.add(s);
		}
		System.out.println("String: " + string);
	}
	
	public void palindrome()
	{
		for(int i =0;i<string.size();i++)
		{
			int flag=0;
			String s =string.get(i);
			for(int j=0;i<s.length();j++)
			{
				if(s.charAt(j) == s.charAt(s.length() -1-j))
				{
					flag=1;
				}
				if(flag==1)
				{
					pali.add(s);
				}
				break;
			}
		}
	}

	public void Display()
	{
		System.out.println("List: " + list);
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
		System.out.println("Prime: " + prime);
		System.out.println("String: " + string);
		System.out.println("palindrome: " + pali);
		
	}
}

public class Assignment8{
	public static void main(String args[])
	{
		
		Number a =new Number();
		a.GetData();
		a.evenOdd();
		a.prime();
		a.Display();
		a.setString();
		a.palindrome();
		a.Display();
	}
}