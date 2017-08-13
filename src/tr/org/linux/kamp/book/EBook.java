package tr.org.linux.kamp.book;

public class EBook extends Book{
	
	protected double fileSize;
	protected String encodingFormat;
	protected int numberOfDevicesBookBeingUsed;
	
	
	public EBook(String name, String author, double price, String bookId, int numberOfDevicesBookBeingUsed,double fileSize,String encodingFormat) {
		super(name, author, price, bookId);
		this.numberOfDevicesBookBeingUsed = numberOfDevicesBookBeingUsed;
		this.fileSize= fileSize;
		this.encodingFormat =encodingFormat;
	}
	
	public void addDevice(){
		numberOfDevicesBookBeingUsed++;
	}
	
	public void removeDevice(){
		numberOfDevicesBookBeingUsed--;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public int getNumberOfDevicesBookBeingUsed() {
		return numberOfDevicesBookBeingUsed;
	}

	public void setNumberOfDevicesBookBeingUsed(int numberOfDevicesBookBeingUsed) {
		this.numberOfDevicesBookBeingUsed = numberOfDevicesBookBeingUsed;
	}
	
	
	
	

}
