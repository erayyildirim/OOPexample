package tr.org.linux.kamp.book;


import java.util.ArrayList;

public class ShoppingCard {
	ArrayList<Book>contents = new ArrayList<>();
	
	
	
	public int numOfEntriesInTheCard(){
		return contents.size();
	}

	public void addBook(Book book){
		contents.add(book);
	}

	public ArrayList<Book> getContents() {
		return contents;
	}

	public void setContents(ArrayList<Book> contents) {
		this.contents = contents;
	}

	
	
	
}

