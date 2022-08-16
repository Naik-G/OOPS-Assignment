package Ass_5;

import java.util.Random;

abstract class Medicine{
	private double price;
	private String expdate;
	abstract void displayLabel();
	void getDetails() {
		System.out.println(price +" "+expdate);
	};
}

class Tablet extends Medicine{
	void displayLabel() {
		System.out.println("Store in a cool dry place");
	}
}

class Syrup extends Medicine{
	void displayLabel() {
		System.out.println("Store in a cool dry place");
	}
}

class Ointment extends Medicine{
	void displayLabel() {
		System.out.println("For External Use Only");
	}
}


public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] medicine = new Medicine[5];
		medicine[0] = new Ointment();
		medicine[1] = new Syrup();
		medicine[2] = new Tablet();
		Random random = new Random();
		int rn = random.nextInt(2 - 0 + 1) + 0;
		medicine[rn].displayLabel();
	}

}
