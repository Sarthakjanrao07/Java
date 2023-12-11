//Problem Statement::

/*
Design a class ‘Complex ‘with data members for real and imaginary part. 
Provide default and Parameterized constructors. Write a program to perform 
arithmetic operations of two complex numbers.
*/

package sarthak;
import java.util.*;

class Complex_No{
	float real,img;
	public Complex_No(){
		real=0;
		img=0;
	}
	public Complex_No(float real ,float img){
		this.real=real;
		this.img=img;
	}
	
	public void Display(Complex_No num1,Complex_No num2) {
		System.out.println("First Complex Numbers =("+num1.real+")+("+num1.img+")i");
		System.out.println("Second Complex Numbers =("+num2.real+")+("+num2.img+")i");
	}
	
	public void AddNumbers(Complex_No num1,Complex_No num2) {
		float real,img;
		real=(num1.real+num2.real);
		img=(num1.img+num2.img);
		System.out.println("Addition of Complex Numbers =" +real+ " +" +img+ "i");
	}
	
	public void SubNumbers(Complex_No num1,Complex_No num2) {
		
		float real,img;
		real=(num1.real-num2.real);
		img=(num1.img-num2.img);

		System.out.println("Substraction of Complex Numbers =" +real+ "+" +img + "i");
	}
	
	public void MultiNumbers(Complex_No num1,Complex_No num2) {

		float real,img;
		real=(num1.real*num2.real-num1.img*num2.img);
		img=(num1.real*num2.img+num1.img*num2.real);
		System.out.println("Multiplication of Complex Numbers =("+real+")+("+img+")i");
	}
	
	public void DivNumbers(Complex_No num1,Complex_No num2) {

		float real,img;
		real=(num1.real*num2.real+num1.img*num2.img)/(num2.real*num2.real+num2.img*num2.img);
		img=(num1.img*num2.real-num1.real*num2.img)/(num2.real*num2.real+num2.img*num2.img);

		System.out.println("Division of Complex Numbers =" + real + img + "i");	
	}
}

//======================= CLASS Main =======================//
public class Assignment1 {

	public static void main(String[] args) {
		float num1,num2;
		Complex_No cal=new Complex_No();
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Complex number in a+bi format : ");
		
		
		System.out.print("Enter real part of First Number: a : ");
		num1=Sc.nextFloat();
		System.out.print("Enter img part of First Number: b : ");
		num2=Sc.nextFloat();
		Complex_No Com1=new Complex_No(num1,num2);
		
		
		System.out.print("Enter real part of Second Number: a : ");
		num1=Sc.nextFloat();
		System.out.print("Enter img part of Second Number: b : ");
		num2=Sc.nextFloat();
		Complex_No Com2=new Complex_No(num1,num2);
		Sc.close();
		
		System.out.print("\n");
		cal.Display(Com1,Com2);
		System.out.print("\n");
		
		cal.AddNumbers(Com1,Com2);
		cal.SubNumbers(Com1,Com2);
		cal.MultiNumbers(Com1,Com2);
		cal.DivNumbers(Com1, Com2);
	}

}
