package in.happycoding.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import in.happycoding.Mapper.PersonMapper;
import in.happycoding.bean.Person;

@Component

public class PersonDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Person> getAll() {
		final String query = "SELECT * FROM person";

		return jdbcTemplate.query(query, new PersonMapper());
	}

	public void save(Person person) {
		final String query = "INSERT INTO person VALUES (?, ?, ? ,?)";
		Object[] params = { person.getId(), person.getFirstName(), person.getLastName(), person.getLaptop_id() };
		jdbcTemplate.update(query, params);
	}


	public void delete(int id) {
		final String query = "DELETE FROM person WHERE id =  " + id;
		jdbcTemplate.update(query);
	}

	public Person getById(int id) {
		
		final String query = "SELECT * FROM person WHERE id = "+id;
		
		Person p = jdbcTemplate.queryForObject(query, new PersonMapper());
		
		return p;
	}

	public void update(Person person) {
		
		final String query = "UPDATE PERSON SET firstName = ?, lastName = ?, laptop_id = ? WHERE id = ?";
		Object [] params = {person.getFirstName(), person.getLastName(), person.getLaptop_id(), person.getId()};
		jdbcTemplate.update(query, params);
		
	}
}
