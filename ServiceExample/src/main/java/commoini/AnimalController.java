package commoini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Animals.Animal;

@RestController
@RequestMapping("/auto")
public class AnimalController {

//	@Qualifier("cat")
	@Autowired
	private Animal animal;
	
	@GetMapping
	public String fetchDogCharacteristics() {
		return animal.characteristics();
		}
}
