package in.happycoding.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.happycoding.Mapper.StudentMapper;
import in.happycoding.bean.Student;

@Component
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Student> getall() {
		final String query = "SELECT * FROM student";
		return jdbcTemplate.query(query, new StudentMapper());
	}

	public void addNew(Student student) {
		final String query = "INSERT INTO student VALUES (?, ?, ?, ?)";
		Object[] params = { student.getRollNumber(), student.getName(), student.getAddress(), student.getContact() };
		jdbcTemplate.update(query, params);
	}

	public void delete(int rollNumber) {
		final String query = "DELETE FROM student WHERE rollNumber = " + rollNumber;
		jdbcTemplate.update(query);

	}

	public Student getByRollNumber(int rollNumber) {

		final String query = "SELECT * FROM student WHERE rollNumber = " + rollNumber;
		return jdbcTemplate.queryForObject(query, new StudentMapper());

	}
	
	public void update(Student student)
	{
		final String query = "UPDATE student SET name = ?, address = ?, contact = ? WHERE rollNumber = ?";
		Object[] params = {student.getName(), student.getAddress(), student.getContact(), student.getRollNumber()};
		jdbcTemplate.update(query, params);
		
	}
}
