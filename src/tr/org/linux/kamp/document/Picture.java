package tr.org.linux.kamp.document;

import java.time.LocalDate;

public class Picture extends Document {
	
	public Picture(){
		System.out.println("Resim oluşturuldu");
	}

	@Override
	void getText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void printDocument() {
		// TODO Auto-generated method stub
		
	}
	public LocalDate getCurrentDate() {
		System.out.println(currentDate);
		return currentDate;
	}

}
