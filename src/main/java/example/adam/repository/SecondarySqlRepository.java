package example.adam.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SecondarySqlRepository {

	@Autowired
	private JdbcTemplate secondaryJdbcTemplate;

	public List<String> getSizes() {
		String querySql = "select SIZE from ORANGES";
		List<String> result = secondaryJdbcTemplate.queryForList(querySql, String.class);
		return result;
	}

}
