package example.adam.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/*
 * Root context configuration for development environment
 */
@Configuration
@Profile("dev")
@PropertySource("classpath:application-dev.yml")
public class AppEnvDevConfiguration extends AppEnvConfiguration {

}
