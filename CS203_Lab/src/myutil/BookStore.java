package myutil;

public class BookStore {

	public static  int totalBookSold = 0;
	
private BookCategories book;	
private String author;
private String title;
private String publisher;
private double sellingPrice;
private int quantity;

 
public BookStore(BookCategories book, String author, String title,String publisher, double sellingPrice, int quantity) {
	this.book = book;
	this.author = author;
	this.title = title;
	this.publisher = publisher;
	this.sellingPrice = sellingPrice;
	this.quantity = quantity;
}
public static int trackSalesStatus() {
	
	return totalBookSold;
}	
	public  void sold(int quantity) {
		totalBookSold += quantity;
		this.quantity -= quantity;
	}
public  int quantityAvialable() {
	
	return this.quantity;
}
 
}
