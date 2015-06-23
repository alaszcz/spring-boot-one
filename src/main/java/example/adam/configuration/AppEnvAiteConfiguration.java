package example.adam.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/*
 * Root context configuration for AITE environment
 */
@Configuration
@Profile("aite")
@PropertySource("classpath:application-aite.yml")
public class AppEnvAiteConfiguration extends AppEnvConfiguration {

}
