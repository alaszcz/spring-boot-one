package example.adam.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 * Root context configuration for development environment
 */
@Configuration
@Profile("dev")
public class AppEnvDevConfiguration extends AppEnvConfiguration {

}
