package tr.org.linux.kamp.file;

public class ExecutableFile extends BinaryFile implements Openable {

	protected String platform;
	// çalıştırılabilir dosyalar bytelardan olusur
	protected byte[] contents;

	public ExecutableFile(String name, int size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BinaryFile getCopy() {

		return new ExecutableFile(platform, size);
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void open() {
		System.out.println("Dosya açıldı");

	}

}
