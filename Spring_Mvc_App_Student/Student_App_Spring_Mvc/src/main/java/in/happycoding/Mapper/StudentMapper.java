package in.happycoding.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import in.happycoding.bean.Student;

public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int row) throws SQLException {
		
		Student student = new Student();
		student.setRollNumber(rs.getInt("rollNumber"));
		student.setName(rs.getString("name"));
		student.setAddress(rs.getString("address"));
		student.setContact(rs.getString("contact"));
		return student;
	}

	

	


}
