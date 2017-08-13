package tr.org.linux.kamp.file;

import java.util.ArrayList;

public class DataFile extends BinaryFile {
	protected String compressionFormat;
	protected ExecutableFile opensWith;

	// protected boolean [] bits;
	ArrayList<Boolean> bits = new ArrayList<>();

	public DataFile(String name, int size, String compressionFormat,
			ExecutableFile opensWith, ArrayList<Boolean> bits) {
		super(name, size);
		this.compressionFormat = compressionFormat;
		this.opensWith = opensWith;
		this.bits = bits;
	}

	@Override
	public void onClick() {
		System.out.println("DataFile'a tıklandı");

	}

	@Override
	public BinaryFile getCopy() {
		return new DataFile(compressionFormat, size, compressionFormat,
				opensWith, bits);
	}

	public String getCompressionFormat() {
		return compressionFormat;
	}

	public void setCompressionFormat(String compressionFormat) {
		this.compressionFormat = compressionFormat;
	}

	public ExecutableFile getOpensWith() {
		return opensWith;
	}

	public void setOpensWith(ExecutableFile opensWith) {
		this.opensWith = opensWith;
	}

	public ArrayList<Boolean> getBits() {
		return bits;
	}

	public void setBits(ArrayList<Boolean> bits) {
		this.bits = bits;
	}

}
