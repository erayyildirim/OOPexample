package tr.org.linux.kamp.document;

import java.time.LocalDate;

public class Pdf extends Document {
	
	private String author;
	public Pdf(){
		System.out.println("Pdf dosyası oluşturuldu");
	
	}
	

	@Override
	void getText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void printDocument() {
		System.out.println("Print document: Eray Yıldırım 95 yılında...");
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public LocalDate getCurrentDate() {
		System.out.println(currentDate);
		return currentDate;
	}
	

}
