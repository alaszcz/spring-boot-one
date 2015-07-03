package example.adam.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/*
 * Root context configuration for development environment
 */
@Configuration
@Profile("dev")
public class AppEnvDevConfiguration extends AppEnvConfiguration implements DatabaseConfiguration {

	@Bean
	@Primary // this is for defining default DataSource for Autowiring
	@ConfigurationProperties(prefix="datasource.primary")
	@Override
	public DataSource primaryDataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.HSQL)
				.addScripts("classpath:schema-apples.sql", "classpath:data-apples.sql")
				.build();
	}

	@Bean
	@ConfigurationProperties(prefix="datasource.secondary")
	@Override
	public DataSource secondaryDataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.HSQL)
				.addScripts("classpath:schema-oranges.sql", "classpath:data-oranges.sql")
				.build();
	}

	@Bean
	@Override
	public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource") DataSource datasource) {
		return new JdbcTemplate(datasource);
	}

	@Bean
	@Override
	public JdbcTemplate secondaryJdbcTemplate(@Qualifier("secondaryDataSource") DataSource datasource) {
		return new JdbcTemplate(datasource);
	}

}
