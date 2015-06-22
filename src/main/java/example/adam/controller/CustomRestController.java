package example.adam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {

	@RequestMapping("/rest")
	public String rest() {
		return "Hello World!";
	}

}
