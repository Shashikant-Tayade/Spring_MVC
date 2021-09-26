package in.happycoding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.happycoding.DAO.PersonDao;
import in.happycoding.bean.Person;

@Controller

public class PersonController {

	@Autowired
	private PersonDao personDao;

	@RequestMapping("/")
	public String getall(ModelMap modelMap) {

		List<Person> listOfPerson = personDao.getAll();

		modelMap.addAttribute("listOfPerson", listOfPerson);

		return "getall";

	}

	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id") int id) {

		personDao.delete(id);

		return "redirect:/";
	}

	@RequestMapping("/add-new-person")
	public String addNewPerson(Model model) {
		model.addAttribute("command", new Person(0, "", "", ""));
		return "add-new-person";
	}

	@RequestMapping("/save-person")
	public String savePerson(@ModelAttribute("person") Person person) {
		personDao.save(person);
		return "redirect:/";
	}
	
	@RequestMapping("/editperson")
	public String editPerson(@RequestParam ("id") int id, Model model)
	{	
		Person person = personDao.getById(id);
		model.addAttribute("command",person);
		return "editperson";
	}

	@RequestMapping("/updateperson")
	public String updatePerson(@ModelAttribute ("person") Person person)
	{
		personDao.update(person);
		return "redirect:/";
	}
}
