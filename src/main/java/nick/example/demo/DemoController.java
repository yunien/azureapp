package nick.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String index() {
		return "DEV111 Greetings from Spring Boot! DEV";
	}
}
