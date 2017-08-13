package tr.org.linux.kamp.document;

import java.util.ArrayList;
import java.util.Random;



public class DocumentApp {
	private static Random rgen = new Random();
	//constructor eklemesi listeye
	//documents.add(new Pf("eray", "bu bir pdf dokumanıdır);
	
	public static void main(String[] args) {
		LibreOffice lbr = new LibreOffice();
		Pdf pdf = new Pdf();
		Picture pctr = new Picture();
		System.out.println("---------------------------");
		
		int random = rgen.nextInt(3);
		ArrayList<Document> documents = new ArrayList<Document>();
		
		pdf.setAuthor("eray");
		pdf.setContent("Java ile programlama");
		
		
		
		documents.add(lbr);
		documents.add(pdf);
		documents.add(pctr);
		
		
		
		documents.get(random).printDocument();
		documents.get(random).getCurrentDate();
		documents.get(random).getContent();
		
		if(documents.get(random).equals(pdf)){
			System.out.println("Bu dosyanın yazarı: "+ pdf.getAuthor() +" "+ pdf.getCurrentDate()+  " tarihinde yazmıştır.");
			
		}
		
		
		
		
		
	}

}
