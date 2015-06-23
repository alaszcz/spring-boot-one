package example.adam.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan(basePackages={"example.adam.controller"})
@Import({AppEnvDevConfiguration.class, AppEnvAiteConfiguration.class})
public class AppConfiguration {

	// the app @Configuration class injected for this @Profile
	@Autowired
	private AppEnvConfiguration appEnvConfiguration;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AppConfiguration.class, args);
	}

	@Bean
	public String environmentName() {
		return appEnvConfiguration.getEnvironmentName();
	}

	@Bean
	public String environmentVersion() {
		return appEnvConfiguration.getVersion();
	}

}
