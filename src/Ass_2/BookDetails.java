package Ass_2;

import java.util.Scanner;

class Book{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}

class EngineeringBook extends Book{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

public class BookDetails {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Number: ");
		book.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Book Title: ");
		book.setTitle(sc.nextLine());
		System.out.print("Enter Book Author: ");
		book.setAuthor(sc.nextLine());
		System.out.print("Enter Book Price: ");
		book.setPrice(sc.nextFloat());
		EngineeringBook ebook = new EngineeringBook();
		sc.nextLine();
		System.out.print("Enter Book Category: ");
		ebook.setCategory(sc.nextLine());
		System.out.println("\r\n============Book Data============");
		System.out.println("Book Number: "+book.getBookNo());
		System.out.println("Book Title: "+book.getTitle());
		System.out.println("Book Author: "+book.getAuthor());
		System.out.println("Book Price: "+book.getPrice());
		System.out.println("Book Category: "+ebook.getCategory());
	}

}
