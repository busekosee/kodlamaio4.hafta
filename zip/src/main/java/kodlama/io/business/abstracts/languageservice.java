package kodlama.io.business.abstracts;

import kodlama.io.entities.concretes.pd;

public interface languageservice {
	 java.util.List<pd> getAll();
	public static void add(pd language) {
		 System.out.println("sisteme dil eklendi");
	 }
	 public static void delete(pd language) {
		 System.out.println("sistemden dil silindi");
		 
	 }
	 public static void update(pd language) {
		 System.out.println("sistem güncellendi");
	 }
	 String getLanguageById(int id);
}
