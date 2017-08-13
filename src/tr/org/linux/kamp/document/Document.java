package tr.org.linux.kamp.document;

import java.time.LocalDate;

public abstract class Document {
	protected String content;
	LocalDate currentDate = LocalDate.now();
	
	abstract void getText();
	abstract void printDocument();
	
	
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public LocalDate getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	
	
	

}
