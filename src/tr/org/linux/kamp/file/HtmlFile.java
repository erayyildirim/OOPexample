package tr.org.linux.kamp.file;
import java.util.ArrayList;

public class HtmlFile extends TextFile {

	protected ExecutableFile browserCompatibleWith;
	protected ArrayList<HtmlFile> linksTo = new ArrayList<>();

	public HtmlFile(String name, int size,
			ExecutableFile browserCompatibleWith, ArrayList<HtmlFile> linksTo) {
		super(name, size);
		this.browserCompatibleWith = browserCompatibleWith;
		this.linksTo = linksTo;
	}

	@Override
	public void onClick() {
		System.out.println("HtmlFile---->onClick");

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

}
