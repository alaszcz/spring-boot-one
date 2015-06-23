package example.adam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import example.adam.util.DateTimeUtil;

@Controller
public class CustomController {
	
	@Autowired
	private DateTimeUtil dateTimeUtil;

	@RequestMapping(value="/custom")
	public String custom(ModelMap modelMap) {
		modelMap.put("msg", dateTimeUtil.getTimeFormatted() + ": Hello");
 		return "CustomPage";
 	}
 
}
