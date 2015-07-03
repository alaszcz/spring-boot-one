package example.adam.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableAutoConfiguration
@ComponentScan(basePackages={"example.adam.controller", "example.adam.repository", "example.adam.util"})
@Import({AppEnvDevConfiguration.class, AppEnvAiteConfiguration.class})
public class AppConfiguration {

	private static int PORT = 9000;
	private Logger LOG = LoggerFactory.getLogger(AppConfiguration.class);

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

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	// This is to override some default setting on embedded server i.e. port number
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setPort(PORT);
		LOG.info("SPRING-BOOT-ONE APPLICATION ACCESSIBLE AT http://localhost:" + PORT + "/index.jsp");
		return factory;
	}

}
