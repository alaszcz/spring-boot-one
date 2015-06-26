package example.adam.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SecondarySqlRepository {

	@Autowired
	private JdbcTemplate secondaryJdbcTemplate;

	public List<String> getStrings() {
//		String querySql = "select NAME from DATA_TABLE";
		String querySql = "select field_name from spk_field_config";
		List<String> result = secondaryJdbcTemplate.queryForList(querySql, String.class);
		return result;
	}

}
