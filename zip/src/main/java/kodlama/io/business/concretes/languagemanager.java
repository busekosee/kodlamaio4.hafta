package kodlama.io.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.business.abstracts.languageservice;
import kodlama.io.dataaccess.abstracts.LanguageRepository;
import kodlama.io.entities.concretes.pd;
@Service
public class languagemanager implements languageservice {
	
	private LanguageRepository languagerepository;
	 private List<pd>languages;
@Autowired
	public languagemanager(LanguageRepository languagerepository) {
		super();
		this.languagerepository = languagerepository;
	}
    
		
		
		public void add(pd language) throws Exception {
		if(language.getName().isEmpty()) {
			System.out.println("bos geçilemez");
			}
		
		for(pd dil:languagerepository.getAll()){
			if(dil.getName().equals(language.getName())) {
				
				throw new Exception("aynı dil olamaz");
			
			}
			else {
			LanguageRepository.add(language);
				
			}
		}
		}
			

		
						
		
	
	public void delete(pd language) {
		LanguageRepository.delete(language);
		
		}
	 
       public void update(int id,String language){
    	   LanguageRepository.update(id, language);
       }
       
    	 

		 public String getLanguageById(int id) {
			 return languages.get(id-1).getName();
			
			 }
		 

		  public List<pd>getAll(){
	    	  return languagerepository.getAll();
	      }
			
		

	
	
	
	
		
	
	
	

	

	

}
