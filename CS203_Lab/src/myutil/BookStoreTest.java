package myutil;

public class BookStoreTest {

	public static void main(String[] args) {
		// TO BookStore
		BookCategories catagories1 = new BookCategories(" kids"); 
		BookCategories catagories2 = new BookCategories(" Engineering");
		BookCategories catagories3 = new BookCategories(" Story");
		
		BookStore book1 = new BookStore(catagories1,"John","OOP","Atlassian"+ 55.0, 20, 50);
		
		BookStore book2 = new BookStore(catagories2,"David","PP","Barnes"+ 35.0, 60, 20);
		
		BookStore book3 = new BookStore(catagories3,"Smith","DS","iBooks" + 70.0, 50, 30);
		
		System.out.println("kids Book avaliable in store: "+book1.quantityAvialable());
		
		System.out.println("Engineering Book avaliable in store: "+book2.quantityAvialable());
		
		book1.sold(10);
		book2.sold(5);
        System.out.println("kids Book avaliable in store after sold: "+ book1.quantityAvialable());
		
		System.out.println("Engineering Book avaliable in store after sold: "+ book2.quantityAvialable());
		
		System.out.println("Total sold books: "+ book1.trackSalesStatus());
	}

}
