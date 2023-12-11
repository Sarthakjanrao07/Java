package sarthak;

import java.util.Scanner;
class emplo{
	String name,email;
	int id;
	double sal;
	long mob;
	public emplo(String name,String email,int id,long mob,double sal)
	{
		this.name =name;
		this.email=email;
		this.id=id;
		this.mob=mob;
		this.sal=sal;
	}

	void display()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter the email: ");
		email = sc.next();
		System.out.println("Enter the id: ");
		id = sc.nextInt();
		System.out.println("Enter the mob: ");
		mob = sc.nextLong();
		System.out.println("Enter the sal: ");
		sal=sc.nextDouble();
		
		System.out.println("********************************************");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Id: " + id);
		System.out.println("Mobile: " + mob);
		System.out.println("Salary: " + sal);
		System.out.println("********************************************");	
	}
}

class programmer extends emplo
{
	double basicpay;
	public programmer(String name,String email,int id,long mob,double sal)
	{
		super(name,email,id,mob,sal);
	}
	
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the basic pay: ");
		basicpay = sc.nextInt();
	}
	double hra,pf,da,scf;
	public void cal()
	{
 
		hra = basicpay*97/100;
		da = basicpay*10/1000;
		pf = basicpay*12/10;
		scf=basicpay*0.1/100;
	}
	public void output()
	{
		System.out.println("******************Profile*******************");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Id: " + id);
		System.out.println("Mobile: " + mob);
		System.out.println("Salary: " + sal);
		System.out.println("__________________Salary Slip _______________");
		System.out.println("HRA: " + hra);
		System.out.println("pf: " + pf);
		System.out.println("DA: " + da);
		System.out.println("SCF: " + scf);
		System.out.println("********************************************");	
	}
}

class Teamlead extends emplo
{
	double basicpay;
	public Teamlead(String name,String email,int id,long mob,double sal)
	{
		super(name,email,id,mob,sal);
	}
	
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the basic pay: ");
		basicpay = sc.nextInt();
	}
	double hra,pf,da,scf;
	public void cal()
	{
 
		hra = basicpay*97/100;
		da = basicpay*10/1000;
		pf = basicpay*12/10;
		scf=basicpay*0.1/100;
	}
	public void output()
	{
		System.out.println("******************Profile*******************");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Id: " + id);
		System.out.println("Mobile: " + mob);
		System.out.println("Salary: " + sal);
		System.out.println("__________________Salary Slip _______________");
		System.out.println("HRA: " + hra);
		System.out.println("pf: " + pf);
		System.out.println("DA: " + da);
		System.out.println("SCF: " + scf);
		
		System.out.println("********************************************");	
	}
}

class Ass_manager extends emplo
{
	double basicpay;
	public Ass_manager(String name,String email,int id,long mob,double sal)
	{
		super(name,email,id,mob,sal);
	}
	
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the basic pay: ");
		basicpay = sc.nextInt();
	}
	double hra,pf,da,scf;
	public void cal()
	{
 
		hra = basicpay*97/100;
		da = basicpay*10/1000;
		pf = basicpay*12/10;
		scf=basicpay*0.1/100;
	}
	public void output()
	{
		System.out.println("******************Profile*******************");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Id: " + id);
		System.out.println("Mobile: " + mob);
		System.out.println("Salary: " + sal);
		System.out.println("__________________Salary Slip _______________");
		System.out.println("HRA: " + hra);
		System.out.println("pf: " + pf);
		System.out.println("DA: " + da);
		System.out.println("SCF: " + scf);
		
		System.out.println("********************************************");	
	}
}

public class assignment4 
{
	public static void main(String args[])
	{
		int ch;
		do
		{
			System.out.println("Entre the choice: ");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				programmer p = new programmer("","",0,0,0); 
				p.display();
				p.accept();
				p.cal();
				p.output();
				break;
			case 2:
				Teamlead t = new Teamlead("","",0,0,0); 
				t.display();
				t.accept();
				t.cal();
				t.output();
				break;
			case 3:
				Ass_manager m = new Ass_manager("","",0,0,0); 
				m.display();
				m.accept();
				m.cal();
				m.output();
				break;
			case 4:
				System.exit(0);
			}
		}while(ch!=4);	
	}
}
