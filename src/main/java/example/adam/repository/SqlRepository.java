package example.adam.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SqlRepository {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public SqlRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<String> getStrings() {
		String querySql = "select NAME from DATA_TABLE";
		List<String> result = jdbcTemplate.queryForList(querySql, String.class);
		return result;
	}

}
