package kodlama.io.webapicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.business.abstracts.languageservice;
import kodlama.io.entities.concretes.pd;
@RestController
@RequestMapping("/api/brands")
public class controller {
  private languageservice languageservice1;
@Autowired
public controller(languageservice languageservice1) {
	super();
	this.languageservice1 = languageservice1;
}@PostMapping
public static void add(pd language) {
	 System.out.println("sisteme dil eklendi");
	languageservice.add(language);
}@GetMapping
public static void delete(pd language) {
	 System.out.println("sistemden dil silindi");
	 languageservice.delete(language);
}
@GetMapping
public static void update(pd language) {
	 System.out.println("sistem güncellendi");
	  languageservice.update(language);
}
@GetMapping("/getall")
List<pd> getAll() {
	return languageservice1.getAll();
}
}
