package Ass_3;

import java.util.Scanner;

interface Rewardable{
	double rewardPointsInfo(int amount);
}
abstract class PrepaidCard implements Rewardable{
	int cardNo;
	double availableBalance;
	double swipeLimit;
	abstract boolean swipeCard(int amount);
	public abstract double rewardPointsInfo(int amount);
	abstract void rechargeCard();
}

class TravelCard extends PrepaidCard {
	double rewardPoints;
	public double rewardPointsInfo(int amount) {
		return (amount/100)*5;
	}
	void rechargeCard() {
		System.out.print("Enter Amount To Recharge: ");
		Scanner sc = new Scanner(System.in);
		this.availableBalance=this.availableBalance+sc.nextInt();
		System.out.println("Recharge Successfull ! Current Balance is:"+this.availableBalance);
	}
	void cardinfo() {
		System.out.println("===================================");
		System.out.println("Card Number: "+this.cardNo + "\r\nReward Points: " + this.rewardPoints +"\r\nAvailable Balance: "+ this.availableBalance);
		System.out.println("===================================");
	}
	boolean swipeCard(int amount) {
		
		if(amount > this.availableBalance) {
			return false;	
		}else {
			this.availableBalance =  this.availableBalance-amount;
			this.rewardPoints = this.rewardPoints + this.rewardPointsInfo(amount);
			return true;
		}
		
	}
}

public class TestCard {
	public static void main(String[] args) {
		TravelCard card = new TravelCard();
		card.cardNo = 112233;
		int userinput = 0;
		boolean exituser = true;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("===== Welcome To Travel Card ======");
		System.out.println("Your Card Number is "+ card.cardNo);
		System.out.println("press 1 to Recharge Card");
		System.out.println("press 2 to Swipe Card");
		System.out.println("press 3 to View Card Info");
		System.out.println("press 0 to exit");
		if(sc.hasNextInt()) {
		    userinput = sc.nextInt();
		}else {
			exituser = false;
		}
		switch(userinput) {
			case 1:
				card.rechargeCard();
				break;
			case 2:
				System.out.print("Enter Amount To Swipe: ");
				int amount = sc.nextInt();
				boolean status = card.swipeCard(amount);
				if(status) {
					System.out.println("Swipe Successfull !");
					card.cardinfo();
				}else {
					System.out.println("Swipe Failed ! Insufficent Funds !");
				}
				break;
			case 3:
				card.cardinfo();
				break;
			case 0:
				exituser = false;
				break;
			default:
				System.out.println("Choose a Correct option");
		}
	}while(exituser);
		
		
	}

}
