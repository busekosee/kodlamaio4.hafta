package kodlama.io.dataaccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.dataaccess.abstracts.LanguageRepository;
import kodlama.io.entities.concretes.pd;

@Repository
public class InmemoryRepository implements LanguageRepository {
	 private List<pd>languages;
	 
	 public InmemoryRepository() {
		 languages=new ArrayList<pd>();
		 languages.add(new pd(1,"c"));
		 languages.add(new pd(2,"c++"));
		 languages.add(new pd(3,"java"));
		 
		 
		 
		
	}
	 public void add(pd language)  {
		 languages.add(language);
			
			
				

			}
	 public void delete(pd language) {
			pd deleteLanguage=null;
			for(int i=0;i<languages.size();i++) {
				if (language.getId() == languages.get(i).getId()) {
					deleteLanguage = languages.get(i);
				}
			}
			languages.remove(deleteLanguage);
		}

			
		
		
			
		 
		public pd getById(int Id) {
			for(int i=0; i<languages.size();i++) {
				if(languages.get(i).getId()==Id) {
					return languages.get(i);
				}
			}
			return null;
		}


			 
			 

	        
	 

	
	 public List<pd>getAll() {
		return languages;
	}
	 public void update(pd language) {
	pd updateLanguage=null;
			for(int i=0;i<languages.size();i++) {
				if (language.getId() == languages.get(i).getId()) {
					updateLanguage = languages.get(i);
				}
				}
			updateLanguage.setId( language.getId());
			updateLanguage.setName(language.getName());
			
		}
	
	 
	

}
