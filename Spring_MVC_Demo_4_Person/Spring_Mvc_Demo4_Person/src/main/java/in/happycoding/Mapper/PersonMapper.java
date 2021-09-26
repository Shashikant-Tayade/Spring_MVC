package in.happycoding.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.happycoding.bean.Person;

public class PersonMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int row) throws SQLException {

		Person person = new Person();

		person.setId(rs.getInt("id"));
		person.setFirstName(rs.getString("firstName"));
		person.setLastName(rs.getString("lastName"));
		person.setLaptop_id(rs.getString("laptop_id"));

		return person;
	}

}
