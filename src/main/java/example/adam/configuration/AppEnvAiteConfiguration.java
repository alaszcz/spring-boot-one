package example.adam.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

/*
 * Root context configuration for AITE environment
 */
@Configuration
@Profile("aite")
public class AppEnvAiteConfiguration extends AppEnvConfiguration implements DatabaseConfiguration {

	@Bean
	@Primary // this is for defining default DataSource for Autowiring
	@ConfigurationProperties(prefix="datasource.primary")
	@Override
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix="datasource.secondary")
	@Override
	public DataSource secondaryDataSource() {
		return DataSourceBuilder.create().build();
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
