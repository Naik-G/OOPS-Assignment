package com.shape;

public class Rectangle implements Polygon{
	float length;
	float breadth;
	public Rectangle(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public void calcArea() {
		System.out.print("Area of Rectanle is: ");
		System.out.println(this.length * this.breadth);
	}
	public void calcPeri() {
		System.out.print("Perimeter of Rectanle is: ");
		System.out.println(2*(this.length + this.breadth));
	}
	
}
