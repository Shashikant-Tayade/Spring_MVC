package in.happycoding.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.happycoding.DAO.StudentDao;
import in.happycoding.bean.Student;

@Controller
public class Student_Controller {

	@Autowired
	private StudentDao studentDao;

	@RequestMapping("/")
	public String getallPage(ModelMap modelMap) {
		List<Student> listOfStudents = studentDao.getall();
		modelMap.addAttribute("listOfStudents", listOfStudents);
		return "getall";
	}

	@RequestMapping("/addnew")
	public String addnewPage(Model model) {
		model.addAttribute("command", new Student(0, "", "", ""));
		
		return "addnew";

	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("student") Student student )
	{
		studentDao.addNew(student);
		return "redirect:/";
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("rollNumber") int rollNumber)
	{
		studentDao.delete(rollNumber);
		return "redirect:/";
		
	}
	
	@RequestMapping("/edit")
	public String editPage(@RequestParam ("rollNumber") int rollNumber, Model model)
	{
		Student student = studentDao.getByRollNumber(rollNumber);
		model.addAttribute("command", student);
		return "edit";
	}
	
	@RequestMapping("/updatestudent")
	public String update(@ModelAttribute("student") Student student)
	{
		studentDao.update(student);
		return "redirect:/";
		
	}
}
