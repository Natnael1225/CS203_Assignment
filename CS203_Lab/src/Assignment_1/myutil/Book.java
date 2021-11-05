package myutil;

public class Book {

private String  category;
private String author;
private String title;
private String publisher;
private double price;
private int quantity;

 
public Book() {
	this. category =  "kidsFiction";
	this.author = "James";
	this.title = "OOP";
	this.publisher = "Atlasian";
	this.price = 60.0;
	this.quantity = 100;
	
}
public Book(String  category, String author, String title,String publisher, double price, int quantity) {
	this. category =  category;
	this.author = author;
	this.title = title;
	this.publisher = publisher;
	this.price = price;
	this.quantity = quantity;
}

public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Bookcategory: " + category + ", author: " + author + ", title: " + title + ", publisher: " + publisher
			+ ", price: " + price + ", quantity: " + quantity ;
}

 
}
