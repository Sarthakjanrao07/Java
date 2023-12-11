package sarthak;

//design a base class shape with two double type values and member function to 
//input the data and compute area() for calculating area of shape. Derive two classes 
//Triangle and Rectangle make compute area() as abstract function and redefine this function 
//in the derive class to suit their requirement .Write a program that accepts the dimension 
//of Triangle /Rectangle and display calculated area. Implement dynamic binding.


import java.util.Scanner;

abstract class Shape {
	double x, y;

	void accept(double x, double y) {
		this.x = x;
		this.y = y;
	}

	abstract public void Compute_area();
}

class Rectangle extends Shape {
	double length;
	double breadth;

	public void Compute_area() { // method overriding
		length = x;
		breadth = y;
		System.out.println("Area of a Rectangle is: " + (length * breadth) + "sqcm");
	}
}

class Triangle extends Shape {
	double base;
	double height;

	public void Compute_area() { 
		base = x;
		height = y;
		System.out.println("Area of a Triangle is: " + (0.5 * base * height) + "sqcm");
	}
}

public class Assignment5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter Length & Breadth of Rectangle in cm");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		rectangle.accept(l, b);
		rectangle.Compute_area();
		
		Triangle triangle = new Triangle();
		
		System.out.println("\nEnter Height & Base of Triangle in cm");
		double h = sc.nextDouble();
		double base = sc.nextDouble();
		triangle.accept(h, base);
		triangle.Compute_area();
		
	}
}