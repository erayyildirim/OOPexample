package tr.org.linux.kamp.file;

public class PlainTextFile extends TextFile {
	
	protected String[] lines;

	public PlainTextFile(String name, int size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}

	

	public String[] getLines() {
		return lines;
	}

	public void setLines(String[] lines) {
		this.lines = lines;
	}

	@Override
	public void onClick() {
		System.out.println("PlainTextFile --->onClick");

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

}
