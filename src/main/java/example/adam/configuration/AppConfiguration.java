package example.adam.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages={"example.adam.controller"})
public class AppConfiguration {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AppConfiguration.class, args);
	}

}
