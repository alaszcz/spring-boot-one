package example.adam.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PrimarySqlRepository {

	@Autowired
	private JdbcTemplate primaryJdbcTemplate;

	public List<String> getStrings() {
//		String querySql = "select NAME from DATA_TABLE";
		String querySql = "select aid from d7testactions";
		List<String> result = primaryJdbcTemplate.queryForList(querySql, String.class);
		return result;
	}

}
