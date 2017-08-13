package tr.org.linux.kamp.file;

import java.util.ArrayList;

public class FileApp {
	public static void main(String[] args) {
		ArrayList<Boolean> bits = new ArrayList<>();
		bits.add(true);
		bits.add(false);
		bits.add(false);
		ExecutableFile exe = new ExecutableFile("CV", 254);
		DataFile file = new DataFile("Cv",254,"PDF", exe, bits);
		
		file.onClick();
		System.out.println(file.getBits());
		file.setDateCreated("1.1.1.1");
	//	System.out.println(file.getDateCreated());
		System.out.println(file.getName());
		System.out.println(file.getCompressionFormat());
		System.out.println(file.getCopy().name);
		System.out.println(file.getOpensWith().getDateCreated());
		
	}

}
