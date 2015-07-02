package example.adam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import example.adam.repository.SecondarySqlRepository;
import example.adam.repository.PrimarySqlRepository;
import example.adam.util.DateTimeUtil;

@Controller
public class CustomController {
	
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

	@RequestMapping(value="/custom")
	public String custom(ModelMap modelMap) {
		modelMap.put("now", dateTimeUtil.getTimeFormatted());
		modelMap.put("environment", environmentName + " " + environmentVersion);
		modelMap.put("repository1", primarySqlRepository.getNames());
		modelMap.put("repository2", secondarySqlRepository.getSizes());
 		return "CustomPage";
 	}
 
}
