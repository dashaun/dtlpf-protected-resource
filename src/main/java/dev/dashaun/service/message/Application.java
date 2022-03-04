package dev.dashaun.service.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

@RestController
class MessageController {
	@GetMapping("/messages")
	public String[] getMessages() {
		return new String[] {"secret","sesame","kcjug"};
	}
}
