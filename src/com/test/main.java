package com.test;
import com.shape.*;
public class main {

	public static void main(String[] args) {
			Square square = new Square(3);
			square.calcArea();
			square.calcPeri();
			Rectangle rectangle = new Rectangle(3,4);
			rectangle.calcArea();
			rectangle.calcPeri();
	}

}
