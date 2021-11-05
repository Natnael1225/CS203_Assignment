package myutil;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
  
	
	public static  int numberOfBooksSold= 100;
	
		
	List<Book> kidsBooks = new ArrayList<>();
	List<Book> engineeringBook = new ArrayList<>();
	List<Book> storyBooks = new ArrayList<>();
	
	public BookStore() {
		Book book = new Book();
		this.kidsBooks.add(book);
		this.engineeringBook.add(book);
		this.storyBooks.add(book);
	}
	
	public List<Book> getKidsBooks() {
		return kidsBooks;
	}


	public void setKidsBooks(List<Book> kidsBooks) {
		this.kidsBooks = kidsBooks;
	}


	public List<Book> getEngineeringBook() {
		return engineeringBook;
	}


	public void setEngineeringBook(List<Book> engineeringBook) {
		this.engineeringBook = engineeringBook;
	}


	public List<Book> getStoryBooks() {
		return storyBooks;
	}


	public void setStoryBooks(List<Book> storyBooks) {
		this.storyBooks = storyBooks;
	}


	public int trackSalesStatus() {
		int soldKidbook =0;
		for(int i=0; i< kidsBooks.size();i++) {
			soldKidbook += kidsBooks.get(i).getQuantity();
		}
		int soldEnginerbook =0;
		for(int i=0; i< engineeringBook.size();i++) {
			soldEnginerbook  += engineeringBook.get(i).getQuantity();
		}
		int soldStorybook =0;
		for(int i=0; i< storyBooks.size();i++) {
			soldStorybook+= storyBooks.get(i).getQuantity();
		}
		numberOfBooksSold +=soldKidbook+soldEnginerbook+soldStorybook;
		
		return numberOfBooksSold;
	}
	public int bookQuantity() {
       int quantKidbook =0;
       for(int i=0; i< kidsBooks.size();i++) {
    	   quantKidbook += kidsBooks.get(i).getQuantity();
       }
       int quantEnginerbook =0;
       for(int i=0; i< engineeringBook.size();i++) {
    	   quantEnginerbook += engineeringBook.get(i).getQuantity();
       }
       int quantStorybook =0;
       for(int i=0; i< storyBooks.size();i++) {
    	   quantStorybook += storyBooks.get(i).getQuantity();
       }
		int totalAmountBooksInStore = quantKidbook + quantEnginerbook + quantStorybook;
		
		return totalAmountBooksInStore;
	}

	
}
