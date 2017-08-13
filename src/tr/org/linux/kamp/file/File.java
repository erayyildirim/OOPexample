package tr.org.linux.kamp.file;

public abstract class File {
	protected String name;
	protected int size;
	protected String dateCreated;
	
	
	
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public abstract void onClick();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	

}
