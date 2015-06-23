package example.adam.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

/*
 * Business layer abstraction for environment configuration 
 */
public abstract class AppEnvConfiguration {

	@Autowired
	private Environment env;

	@Value("${environment.name}")
	private String envName;
	
	public String getEnvironmentName() {
		return envName;
	}

	public String getVersion() {
		return env.getProperty("environment.version");
	}

}
