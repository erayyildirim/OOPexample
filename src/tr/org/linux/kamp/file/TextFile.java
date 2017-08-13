package tr.org.linux.kamp.file;

public abstract class TextFile extends File implements Openable {
	

	protected String encoding;
	protected long numChars;
	
	public TextFile(String name, int size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public long getNumChars() {
		return numChars;
	}

	public void setNumChars(long numChars) {
		this.numChars = numChars;
	}

}
