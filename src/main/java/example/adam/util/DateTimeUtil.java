package example.adam.util;

import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Component;

@Component
public class DateTimeUtil {
	
	@Autowired
	private Environment env;
	
	public Date getTime() {
		return new Date();
	}

	public String getTimeFormatted() {
		Date date = getTime();
		return new DateFormatter(env.getProperty("format.datetime")).print(date, Locale.getDefault());
	}

}
