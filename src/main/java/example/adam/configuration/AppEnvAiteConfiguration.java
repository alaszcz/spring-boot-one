package example.adam.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 * Root context configuration for AITE environment
 */
@Configuration
@Profile("aite")
public class AppEnvAiteConfiguration extends AppEnvConfiguration {

}
