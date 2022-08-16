package com.shape;

public class Square implements Polygon{
	float side;
	public Square(float side){
		this.side = side;
	}
	public void calcArea() {
		System.out.print("Area of Square is: ");
		System.out.println(this.side * this.side);
	}
	public void calcPeri() {
		System.out.print("Perimeter of Square is: ");
		System.out.println(4*this.side);
	}
}
