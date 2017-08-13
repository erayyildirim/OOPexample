package tr.org.linux.kamp.file;

public abstract class BinaryFile extends File{
	
	

	
	public BinaryFile(String name, int size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}

	public abstract BinaryFile getCopy();

}
