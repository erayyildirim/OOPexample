package tr.org.linux.kamp.book;

import java.util.ArrayList;

public class BookApp {
	
	
	public static void main(String[] args) {
		Book book = new Book("Yaban","Yakup Kadri Karaosmanoğlu", 20.0 , "2");
		EBook ebook = new EBook("Sevdadır","Arkadaş Zekai Onder", 30.0 , "5", 2,20.5,"pdf");
		ShoppingCard card = new ShoppingCard();
		Customer cust = new Customer("Eray","Yıldırım");
		
		ArrayList<Purchase>purchaseHistory = new ArrayList<>();
		
		card.addBook(ebook);
		card.addBook(book);
		Purchase purc = new Purchase("1.1.1","1.1.1",2,card);
		cust.placePurchase(purc);
		
		System.out.println(cust.getPurchaseCount());
		cust.setPurchaseHistory(purchaseHistory);
		
	}

}
