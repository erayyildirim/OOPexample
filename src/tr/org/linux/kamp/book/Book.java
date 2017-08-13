package tr.org.linux.kamp.book;

public class Book {
	protected String name;
	protected String author;
	protected double price;
	protected String bookId;
	private double discountRate = 0.3;
	
	
	
	public Book(String name, String author, double price, String bookId) {
		
		this.name = name;
		this.author = author;
		this.price = price;
		this.bookId = bookId;
	
	}

	private void applyDiscount(){
		price=price-(price*discountRate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	

}
