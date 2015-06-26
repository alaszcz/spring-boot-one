package example.adam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.adam.repository.PrimarySqlRepository;
import example.adam.repository.SecondarySqlRepository;
import example.adam.util.DateTimeUtil;

@RestController
public class CustomRestController {

	@Value("${application.message.text}")
	private String message;

	@Autowired
	private DateTimeUtil dateTimeUtil;

	@Autowired
	private String environmentName;

	@Autowired
	private String environmentVersion;

	@Autowired
	private PrimarySqlRepository primarySqlRepository;

	@Autowired
	private SecondarySqlRepository secondarySqlRepository;

	@RequestMapping("/rest")
	public String rest() {
		return dateTimeUtil.getTimeFormatted() + ": " + environmentName + " ver. " + environmentVersion +  ": " + message + " - " + primarySqlRepository.getStrings() + " - " + secondarySqlRepository.getStrings();
	}

}
