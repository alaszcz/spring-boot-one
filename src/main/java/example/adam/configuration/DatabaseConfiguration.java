package example.adam.configuration;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public interface DatabaseConfiguration {

	public DataSource primaryDataSource();
	public DataSource secondaryDataSource();
	public JdbcTemplate primaryJdbcTemplate(DataSource datasource);
	public JdbcTemplate secondaryJdbcTemplate(DataSource datasource);

}
