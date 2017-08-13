package tr.org.linux.kamp.document;

import java.time.LocalDate;

public class LibreOffice extends Document{
	
	public LibreOffice(){
		System.out.println("LibreOffice dosyası oluşturuldu");
	}

	@Override
	void getText() {
		System.out.println("Ben bir LibreOffice metniyim.");
		
	}

	@Override
	void printDocument() {
		System.out.println("Print document: Ozgur LibreOffice");
		
	}
	public LocalDate getCurrentDate() {
		System.out.println(currentDate);
		return currentDate;
	}

}
