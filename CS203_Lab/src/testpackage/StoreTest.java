package testpackage;

import myutil.BookStore;

public class StoreTest {

	public static void main(String[] args) {
		
		BookStore book1= new BookStore();
		
		BookStore book2= new BookStore();
		
		
		
  System.out.println("Total amount books avaliable in store is: "+ book1.bookQuantity());
		
  System.out.println("Total sold books: "+book1.trackSalesStatus());
		
	

  System.out.println("Book avaliable in store is: "+ book2.bookQuantity());
	
  System.out.println("Total sold books: "+book2.trackSalesStatus());
		
    
	}

}
